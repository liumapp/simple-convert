package com.liumapp.simple.convert.converter;

import com.liumapp.qtools.file.basic.FileTool;
import com.liumapp.simple.convert.exceptions.CheckLicenseFailedException;
import com.liumapp.simple.convert.exceptions.InitDocumentsFailedException;
import com.liumapp.simple.convert.factory.HtmlToPdfConverterFactory;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

/**
 * file HtmlToPdfConverterTest.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/4/12
 */
public class HtmlToPdfConverterTest {

    @Test
    public void convertByFilePath() throws InitDocumentsFailedException, CheckLicenseFailedException {
        Converter converter = new HtmlToPdfConverterFactory().getInstance();
        converter.convertByFilePath(HtmlToPdfConverterTest.class.getClassLoader().getResource("test.html").getPath(), "./result.pdf");
        assertEquals(true, FileTool.isFileExists("./result.pdf"));
    }

    @Test
    public void convertByStream() throws InitDocumentsFailedException, IOException {
        Converter converter = new HtmlToPdfConverterFactory().getInstance();
        String targetFilePath = HtmlToPdfConverterTest.class.getClassLoader().getResource("test.html").getPath();
        InputStream is = new FileInputStream(targetFilePath);
        OutputStream os = new FileOutputStream(new File("./result2.pdf"));
        converter.convertByStream(is, os);
        os.flush();
        is.close();
        os.close();
        assertEquals(true, FileTool.isFileExists("./result2.pdf"));
    }

    @Test
    public void convertByBase64() {

    }
}