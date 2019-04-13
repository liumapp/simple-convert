package com.liumapp.simple.convert.documents;

import com.aspose.words.Document;
import com.aspose.words.DocumentBuilder;
import com.liumapp.simple.convert.exceptions.InitDocumentsFailedException;

/**
 * file DocumentUpdater.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/4/13
 */
public interface DocumentUpdater {

    public Document getDocument ();

    public DocumentBuilder getDocumentBuilder();

    /**
     * 初始化document及builder
     */
    public void initDocuments () throws InitDocumentsFailedException;

}
