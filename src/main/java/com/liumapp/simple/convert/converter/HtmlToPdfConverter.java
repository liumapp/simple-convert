package com.liumapp.simple.convert.converter;

import com.aspose.words.Document;
import com.aspose.words.DocumentBuilder;
import com.aspose.words.PageSetup;
import com.aspose.words.SaveFormat;
import com.liumapp.qtools.file.basic.FileTool;
import com.liumapp.simple.convert.exceptions.ConvertFailedException;

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
    public OutputStream convertByStream(InputStream inputStream) throws ConvertFailedException {
        beforeConvert();
        afterConvert();
        return null;
    }

    @Override
    public String convertByBase64(String sourceBase64) throws ConvertFailedException {
        beforeConvert();
        afterConvert();
        return null;
    }
}
