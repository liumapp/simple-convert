package com.liumapp.simple.convert.converter;

import com.liumapp.qtools.file.basic.FileTool;
import com.liumapp.simple.convert.exceptions.InitDocumentsFailedException;
import com.liumapp.simple.convert.factory.DocToPdfConverterFactory;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * file DocToPdfConverterTest.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/4/12
 */
public class DocToPdfConverterTest {

    @Test
    public void convertByFilePath() throws InitDocumentsFailedException {
        Converter converter = new DocToPdfConverterFactory().getInstance();
        converter.convertByFilePath("./data/test.doc", "./result4.pdf");
        assertEquals(true, FileTool.isFileExists("./result4.pdf"));
    }

    @Test
    public void convertByStream() {

    }

    @Test
    public void convertByBase64() {
    }
}