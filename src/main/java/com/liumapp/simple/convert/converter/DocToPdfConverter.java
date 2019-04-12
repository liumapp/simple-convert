package com.liumapp.simple.convert.converter;

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

    @Override
    public void convertByFilePath(String sourcePath, String destPath) {
        super.convertByFilePath(sourcePath, destPath);
    }

    @Override
    public OutputStream convertByStream(InputStream inputStream) {
        return super.convertByStream(inputStream);
    }

    @Override
    public String convertByBase64(String sourceBase64) {
        return super.convertByBase64(sourceBase64);
    }
}
