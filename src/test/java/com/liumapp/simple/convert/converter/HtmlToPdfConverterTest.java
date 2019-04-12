package com.liumapp.simple.convert.converter;

import com.liumapp.simple.convert.factory.HtmlToPdfConverterFactory;
import org.junit.Test;

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
    public void convertByFilePath() {
        Converter converter = new HtmlToPdfConverterFactory().getInstance();
        converter.convertByFilePath(HtmlToPdfConverterTest.class.getClassLoader().getResource("test.html").getPath(), "./result.pdf");
    }

    @Test
    public void convertByStream() {
    }

    @Test
    public void convertByBase64() {
    }
}