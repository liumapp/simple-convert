package com.liumapp.simple.convert.converter;

import com.liumapp.qtools.file.base64.Base64FileTool;
import com.liumapp.qtools.file.basic.FileTool;
import com.liumapp.simple.convert.exceptions.CheckLicenseFailedException;
import com.liumapp.simple.convert.exceptions.InitDocumentsFailedException;
import com.liumapp.simple.convert.factory.HtmlToPdfConverterFactory;
import org.junit.Test;

import java.io.*;
import java.util.Base64;

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
        BasicConverter converter = HtmlToPdfConverterFactory.getInstance();
        String htmlFilePath = HtmlToPdfConverterTest.class.getClassLoader().getResource("test.html").getPath();
        String pdfResultPath = "./result.pdf";
        converter.convertByFilePath(htmlFilePath, pdfResultPath);
        assertEquals(true, FileTool.isFileExists("./result.pdf"));
    }

    @Test
    public void convertByStream() throws InitDocumentsFailedException, IOException {
        BasicConverter converter = HtmlToPdfConverterFactory.getInstance();
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
    public void convertByBase64() throws InitDocumentsFailedException, IOException {
        BasicConverter converter = HtmlToPdfConverterFactory.getInstance();
        String targetFilePath = HtmlToPdfConverterTest.class.getClassLoader().getResource("test.html").getPath();
        InputStream is = new FileInputStream(targetFilePath);
        String inputBase64 = Base64FileTool.inputStreamToBase64(is);
        String resultBase64 = converter.convertByBase64(inputBase64);
        is.close();
        Base64FileTool.saveBase64File(resultBase64, "./result3.pdf");
        assertEquals(true, FileTool.isFileExists("./result3.pdf"));
    }

    @Test
    public void convertByHtmlContents () throws InitDocumentsFailedException, IOException {
        BasicConverter converter = HtmlToPdfConverterFactory.getInstance();
        String htmlContents = "<h3>你的第一个html转PDF文档出来啦！！</h3>\n" +
                "<br>\n" +
                "<div style=\"color: aquamarine\">\n" +
                "    注意：html5以及css3的支持还不够完善！！！\n" +
                "</div>\n";
        String inputBase64 = Base64.getEncoder().encodeToString(htmlContents.getBytes());
        String resultBase64 = converter.convertByBase64(inputBase64);
        Base64FileTool.saveBase64File(resultBase64, "./result10.pdf");
    }
}