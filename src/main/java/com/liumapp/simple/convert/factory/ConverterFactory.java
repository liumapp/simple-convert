package com.liumapp.simple.convert.factory;

import com.liumapp.simple.convert.converter.BasicConverter;
import com.liumapp.simple.convert.exceptions.CheckLicenseFailedException;
import com.liumapp.simple.convert.exceptions.InitDocumentsFailedException;

/**
 * file ConverterFactory.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/4/25
 */
public abstract class ConverterFactory {

    protected BasicConverter basicConverter = null;

    public abstract BasicConverter getConverter () throws CheckLicenseFailedException, InitDocumentsFailedException;

}
