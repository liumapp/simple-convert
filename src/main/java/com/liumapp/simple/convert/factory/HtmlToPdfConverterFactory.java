package com.liumapp.simple.convert.factory;

import com.liumapp.simple.convert.converter.Converter;
import com.liumapp.simple.convert.converter.HtmlToPdfConverter;
import com.liumapp.simple.convert.exceptions.CheckLicenseFailedException;

/**
 * file HtmlToPdfConverterFactory.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/4/12
 */
public class HtmlToPdfConverterFactory extends ConverterFactory {

    @Override
    public Converter getInstance() throws CheckLicenseFailedException {
        if (this.converter == null) {
            return new HtmlToPdfConverter();
        } else {
            return this.converter;
        }
    }
}
