package com.liumapp.simple.convert.converter;

import com.liumapp.simple.convert.exceptions.CheckLicenseFailedException;
import com.liumapp.simple.convert.exceptions.ConvertFailedException;

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
     * 检查license.xml的合法性
     * @throws CheckLicenseFailedException while check license.xml failed
     */
    public void checkLicense() throws CheckLicenseFailedException;

    /**
     * 根据文档的地址进行转换
     * @param sourcePath 要转换的文档地址
     * @param destPath 转换后的文档地址
     */
    public void convertByFilePath (String sourcePath, String destPath) throws ConvertFailedException;

    /**
     * 根据流进行转换
     * 转换结果将直接体现在输入的OutputStream上
     * @param inputStream 文档输入流
     */
    public void convertByStream (InputStream inputStream, OutputStream outputStream) throws ConvertFailedException;

    /**
     * 根据base64进行转换
     * @param sourceBase64 文档输入base64
     * @return 转换结果的base64
     */
    public String convertByBase64 (String sourceBase64) throws ConvertFailedException;

}
