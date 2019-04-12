package com.liumapp.simple.convert.converter;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * file Converter.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/4/12
 */
public interface Converter {

    /**
     * 根据文档的地址进行转换
     * @param sourcePath 要转换的文档地址
     * @param destPath 转换后的文档地址
     */
    public void convertByFilePath (String sourcePath, String destPath);

    public OutputStream convertByStream (InputStream inputStream);

    public String convertByBase64 (String sourceBase64);

}
