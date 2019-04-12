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

    /**
     * 根据流进行转换
     * @param inputStream 文档输入流
     * @return 转换结果的文档输出流
     */
    public OutputStream convertByStream (InputStream inputStream);

    /**
     * 根据base64进行转换
     * @param sourceBase64 文档输入base64
     * @return 转换结果的base64
     */
    public String convertByBase64 (String sourceBase64);

}
