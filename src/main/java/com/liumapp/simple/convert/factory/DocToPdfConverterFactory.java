package com.liumapp.simple.convert.factory;

import com.liumapp.simple.convert.converter.BasicConverter;
import com.liumapp.simple.convert.converter.DocToPdfConverter;
import com.liumapp.simple.convert.exceptions.CheckLicenseFailedException;
import com.liumapp.simple.convert.exceptions.InitDocumentsFailedException;

public class DocToPdfConverterFactory extends ConverterFactory {

    @Override
    public BasicConverter getInstance() throws CheckLicenseFailedException, InitDocumentsFailedException {
        if (this.converter == null) {
            return new DocToPdfConverter();
        } else {
            return this.converter;
        }
    }
}
