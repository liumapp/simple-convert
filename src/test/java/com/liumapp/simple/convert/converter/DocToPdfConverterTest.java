package com.liumapp.simple.convert.converter;

import com.liumapp.qtools.file.basic.FileTool;
import com.liumapp.simple.convert.exceptions.InitDocumentsFailedException;
import com.liumapp.simple.convert.factory.DocToPdfConverterFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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
    public void convertByStream() throws InitDocumentsFailedException, IOException {
        Converter converter = new DocToPdfConverterFactory().getInstance();
        FileInputStream is = new FileInputStream("./data/test.doc");
        FileOutputStream os = new FileOutputStream("./result5.pdf");
        converter.convertByStream(is, os);
        is.close();
        os.close();
        assertEquals(true, FileTool.isFileExists("./result5.pdf"));
    }

    /**
     * todo
     */
    @Test
    public void convertByBase64() {
        // not supported yet.
    }
}