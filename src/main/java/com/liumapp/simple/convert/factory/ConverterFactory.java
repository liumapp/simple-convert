package com.liumapp.simple.convert.factory;

import com.liumapp.simple.convert.converter.BasicConverter;
import com.liumapp.simple.convert.converter.Converter;
import com.liumapp.simple.convert.exceptions.CheckLicenseFailedException;
import com.liumapp.simple.convert.exceptions.InitDocumentsFailedException;

/**
 * file ConverterFactory.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/4/12
 */
public abstract class ConverterFactory {

    protected BasicConverter converter;

    public abstract BasicConverter getInstance() throws CheckLicenseFailedException, InitDocumentsFailedException;

}
