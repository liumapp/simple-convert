package com.liumapp.simple.convert.exceptions;

/**
 * file InitDocumentsFailedException.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/4/13
 */
public class InitDocumentsFailedException extends Exception {

    public InitDocumentsFailedException() {
        super("初始化文档对象失败");
    }

    public InitDocumentsFailedException(String message) {
        super((message == null || message.length() == 0) ? "初始化文档对象失败" : message);
    }

}
