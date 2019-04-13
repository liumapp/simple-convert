package com.liumapp.simple.convert.converter;

import com.aspose.words.Document;
import com.aspose.words.DocumentBuilder;
import com.aspose.words.License;
import com.liumapp.simple.convert.documents.DocumentUpdater;
import com.liumapp.simple.convert.exceptions.CheckLicenseFailedException;
import com.liumapp.simple.convert.exceptions.ConvertFailedException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * file BasicConverter.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/4/12
 */
public abstract class BasicConverter implements Converter, DocumentUpdater {

    protected Document doc;

    protected DocumentBuilder builder;

        /**
         * check license info
         */
        @SuppressWarnings("unchecked")
    public void checkLicense() throws CheckLicenseFailedException {
        try {
            InputStream is = BasicConverter.class.getClassLoader().getResourceAsStream("license.xml");
            License aposeLic = new License();
            aposeLic.setLicense(is);
        } catch (Exception e) {
            throw new CheckLicenseFailedException();
        }
    }

    BasicConverter() throws CheckLicenseFailedException {
        checkLicense();
        initDocuments();
    }

    /**
     * 根据文档的地址进行转换
     * @param sourcePath 要转换的文档地址
     * @param destPath 转换后的文档地址
     */
    public abstract void convertByFilePath (String sourcePath, String destPath) throws ConvertFailedException;

    /**
     * 根据流进行转换
     * @param inputStream 文档输入流
     * @return 转换结果的文档输出流
     */
    public abstract OutputStream convertByStream (InputStream inputStream) throws ConvertFailedException;

    /**
     * 根据base64进行转换
     * @param sourceBase64 文档输入base64
     * @return 转换结果的base64
     */
    public abstract String convertByBase64 (String sourceBase64) throws ConvertFailedException;

    public void beforeConvert() {
        // do anything you like before convert
    }

    public void afterConvert() {
        // do anything you like after convert
    }

    public Document getDocument() {
        return this.doc;
    }

    public DocumentBuilder getDocumentBuilder() {
        return this.builder;
    }

    public void initDocuments() throws Exception {
        this.doc = new Document();
        this.builder = new DocumentBuilder(doc);
    }
}
