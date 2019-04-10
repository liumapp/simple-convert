package com.liumapp.simple.convert.demo;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.html2pdf.jsoup.Jsoup;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.IElement;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.font.FontProvider;
import com.liumapp.qtools.file.basic.FileTool;
import com.liumapp.qtools.file.load.LoadFileTool;

import java.io.*;

/**
 * file Html2Pdf.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/4/10
 */
public class Html2Pdf {

    public static void main (String[] args) throws IOException {
//        String fileName = "./result.pdf";
//
//        String htmlDir = Html2Pdf.class.getClassLoader().getResource("01.html").getPath();
//        String fontPath = Html2Pdf.class.getClassLoader().getResource("./fonts/simfang.ttf").getPath();
//
//        com.itextpdf.html2pdf.jsoup.nodes.Document html = Jsoup.parse(FileTool.readFileAsString(htmlDir));
//
//        String htmlStr = html.html();
//        FontProvider font = new FontProvider();
//        font.addFont(fontPath);
//
//        ConverterProperties c = new ConverterProperties();
//        c.setFontProvider(font);
//        c.setCharset("utf-8");
//        PdfDocument pd = new PdfDocument(new PdfWriter(new FileOutputStream(new File(fileName))));
//        //设置文件标题为fileName，web上展示的标题为此标题
//        pd.getDocumentInfo().setTitle(fileName);
//
//        Document document = new Document(pd, PageSize.A3);
//        try{
//            //设置页面边距 必须先设置边距，再添加内容，否则页边距无效
//            document.setMargins(20, 0, 20, 0);
//            List<IElement> list = HtmlConverter.convertToElements(htmlStr, c);
//            for (IElement ie : list) {
//                document.add((IBlockElement) ie);
//            }
//        }finally {
//            document.close();
//        }
    }

}
