package com.liumapp.simple.convert.converter;

import com.liumapp.simple.convert.exceptions.CheckLicenseFailedException;
import com.liumapp.simple.convert.exceptions.ConvertFailedException;
import com.liumapp.simple.convert.exceptions.InitDocumentsFailedException;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * file DocToPdfConverter.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/4/12
 */
public class DocToPdfConverter extends BasicConverter {

    public DocToPdfConverter() throws CheckLicenseFailedException, InitDocumentsFailedException {
        super();
    }

    @Override
    public void convertByFilePath(String sourcePath, String destPath) throws ConvertFailedException {

    }

    @Override
    public void convertByStream(InputStream inputStream, OutputStream outputStream) throws ConvertFailedException {

    }

    @Override
    public String convertByBase64(String sourceBase64) throws ConvertFailedException {
        return null;
    }
}
