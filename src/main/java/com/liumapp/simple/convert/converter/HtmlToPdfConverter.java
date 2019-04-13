package com.liumapp.simple.convert.converter;

import com.aspose.words.PageSetup;
import com.aspose.words.SaveFormat;
import com.liumapp.qtools.file.basic.FileTool;
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
 * file HtmlToPdfConverter.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/4/12
 */
public class HtmlToPdfConverter extends BasicConverter {

    private static Logger logger = LoggerFactory.getLogger(HtmlToPdfConverter.class);

    public HtmlToPdfConverter() throws CheckLicenseFailedException, InitDocumentsFailedException {
        super();
    }

    @Override
    public void convertByFilePath(String sourcePath, String destPath) throws ConvertFailedException {
        beforeConvert();
        try {
            File file = new File(destPath);
            FileOutputStream os = new FileOutputStream(file);
            String sourceHtml = FileTool.readFileAsString(sourcePath);
            builder.insertHtml(sourceHtml);
            doc.save(os, SaveFormat.PDF);
        } catch (Exception e) {
            throw new ConvertFailedException(e.getMessage());
        }
        afterConvert();
    }

    @Override
    public void convertByStream(InputStream inputStream, OutputStream outputStream) throws ConvertFailedException {
        beforeConvert();
        try {
            builder.insertHtml(FileTool.readFileFromInputStream(inputStream));
            doc.save(outputStream, SaveFormat.PDF);
        } catch (Exception e) {
            throw new ConvertFailedException(e.getMessage());
        }
        afterConvert();
    }

    @Override
    public String convertByBase64(String sourceBase64) throws ConvertFailedException {
        beforeConvert();
        try {
            builder.insertHtml(sourceBase64);
        } catch (Exception e) {
            throw new ConvertFailedException(e.getMessage());
        }
        afterConvert();
        return null;
    }

    @Override
    public void beforeConvert() {
        logger.info("html to pdf converter begin .");
    }

    @Override
    public void afterConvert() {
        logger.info("html to pdf converter done .");
    }
}
