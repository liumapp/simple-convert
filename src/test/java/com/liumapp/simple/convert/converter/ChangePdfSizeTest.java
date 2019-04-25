package com.liumapp.simple.convert.converter;

import com.aspose.words.DocumentBuilder;
import com.aspose.words.PageSetup;
import com.liumapp.qtools.file.basic.FileTool;
import com.liumapp.simple.convert.exceptions.CheckLicenseFailedException;
import com.liumapp.simple.convert.exceptions.InitDocumentsFailedException;
import com.liumapp.simple.convert.factory.HtmlToPdfConverterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * file ChangePdfSizeTest.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/4/15
 */
public class ChangePdfSizeTest {

    @Test
    public void convertByFilePath() throws InitDocumentsFailedException, CheckLicenseFailedException {
        BasicConverter converter = HtmlToPdfConverterFactory.getInstance();
        DocumentBuilder builder = converter.getDocumentBuilder();
        PageSetup pageSetup = builder.getPageSetup();
        pageSetup.setPageWidth(2000);
        pageSetup.setPageHeight(100);
        String htmlFilePath = HtmlToPdfConverterTest.class.getClassLoader().getResource("test.html").getPath();
        String pdfResultPath = "./result11.pdf";
        converter.convertByFilePath(htmlFilePath, pdfResultPath);
        assertEquals(true, FileTool.isFileExists("./result11.pdf"));
    }
}
