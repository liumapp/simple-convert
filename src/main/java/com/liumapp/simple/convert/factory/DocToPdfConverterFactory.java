package com.liumapp.simple.convert.factory;

import com.liumapp.simple.convert.converter.BasicConverter;
import com.liumapp.simple.convert.converter.DocToPdfConverter;
import com.liumapp.simple.convert.exceptions.CheckLicenseFailedException;
import com.liumapp.simple.convert.exceptions.InitDocumentsFailedException;
import org.omg.PortableInterceptor.INACTIVE;

/**
 * file DocToPdfConverterFactory.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/4/25
 */
public class DocToPdfConverterFactory extends ConverterFactory {

    private static class DocToPdfConverterFactoryHolder {
        private static final DocToPdfConverterFactory INSTANCE = new DocToPdfConverterFactory();
    }

    private DocToPdfConverterFactory() {
    }

    public static final BasicConverter getInstance() throws InitDocumentsFailedException {
        return DocToPdfConverterFactoryHolder.INSTANCE.getConverter();
    }

    @Override
    public BasicConverter getConverter() throws CheckLicenseFailedException, InitDocumentsFailedException {
        if (this.basicConverter == null) {
            this.basicConverter = new DocToPdfConverter();
            return this.basicConverter;
        } else {
            return this.basicConverter;
        }
    }

}
