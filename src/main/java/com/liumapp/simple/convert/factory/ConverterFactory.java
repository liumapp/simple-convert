package com.liumapp.simple.convert.factory;

import com.liumapp.simple.convert.converter.Converter;

/**
 * file ConverterFactory.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/4/12
 */
public abstract class ConverterFactory {

    protected Converter converter;

    public abstract Converter getInstance();

}
