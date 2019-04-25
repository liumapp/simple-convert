package com.liumapp.simple.convert.factory;

import com.liumapp.simple.convert.converter.DocToPdfConverter;

/**
 * file DocToPdfConverterFactory.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/4/25
 */
public class DocToPdfConverterFactory {

    static {
        converter = new DocToPdfConverter();
    }

//    @Override
//    public BasicConverter getInstance() throws CheckLicenseFailedException, InitDocumentsFailedException {
//        if (this.converter == null) {
//            return new DocToPdfConverter();
//        } else {
//            return this.converter;
//        }
//    }
}
