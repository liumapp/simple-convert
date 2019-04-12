package com.liumapp.simple.convert.factory;

import com.liumapp.simple.convert.converter.Converter;
import com.liumapp.simple.convert.converter.DocToPdfConverter;

public class DocToPdfConverterFactory extends ConverterFactory {

    @Override
    public Converter getInstance() {
        if (this.converter == null) {
            return new DocToPdfConverter();
        } else {
            return this.converter;
        }
    }
}
