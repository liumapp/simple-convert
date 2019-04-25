package com.liumapp.simple.convert.factory;

import com.liumapp.simple.convert.converter.BasicConverter;
import com.liumapp.simple.convert.converter.Converter;
import com.liumapp.simple.convert.converter.HtmlToPdfConverter;
import com.liumapp.simple.convert.exceptions.CheckLicenseFailedException;
import com.liumapp.simple.convert.exceptions.InitDocumentsFailedException;

/**
 * file HtmlToPdfConverterFactory.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/4/12
 */
public class HtmlToPdfConverterFactory extends ConverterFactory {

    private static class HtmlToPdfConverterFactoryHolder {
        private static final HtmlToPdfConverterFactory INSTANCE = new HtmlToPdfConverterFactory();
    }

    private HtmlToPdfConverterFactory() {
    }

    public static final BasicConverter getInstance () throws InitDocumentsFailedException {
        return HtmlToPdfConverterFactoryHolder.INSTANCE.getConverter();
    }

    @Override
    public BasicConverter getConverter() throws CheckLicenseFailedException, InitDocumentsFailedException {
        if (this.basicConverter == null) {
            return new HtmlToPdfConverter();
        } else {
            return this.basicConverter;
        }
    }
}
