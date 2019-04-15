package com.liumapp.simple.convert.converter;

import com.aspose.words.Document;
import com.aspose.words.SaveFormat;
import com.liumapp.simple.convert.exceptions.CheckLicenseFailedException;
import com.liumapp.simple.convert.exceptions.ConvertFailedException;
import com.liumapp.simple.convert.exceptions.InitDocumentsFailedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
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

    private static Logger logger = LoggerFactory.getLogger(DocToPdfConverter.class);

    public DocToPdfConverter() throws CheckLicenseFailedException, InitDocumentsFailedException {
        super();
    }

    @Override
    public void convertByFilePath(String sourcePath, String destPath) throws ConvertFailedException {
        beforeConvert();
        try {
            FileOutputStream os = new FileOutputStream(new File(destPath));
            this.doc = new Document(sourcePath);
            this.doc.save(os, SaveFormat.PDF);
        } catch (Exception e) {
            throw new ConvertFailedException(e.getMessage());
        }
        afterConvert();
    }

    @Override
    public void convertByStream(InputStream inputStream, OutputStream outputStream) throws ConvertFailedException {
        beforeConvert();
        try {
            this.doc = new Document(inputStream);
            this.doc.save(outputStream, SaveFormat.PDF);
        } catch (Exception e) {
            throw new ConvertFailedException(e.getMessage());
        }
        afterConvert();
    }

    @Override
    public String convertByBase64(String sourceBase64) throws ConvertFailedException {
        return null;
    }

    @Override
    public void beforeConvert() {
        logger.info("doc to pdf converter begin ...");
    }

    @Override
    public void afterConvert() {
        logger.info("doc to pdf converter end ...");
    }
}
