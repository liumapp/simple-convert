package com.liumapp.simple.convert.exceptions;

/**
 * file ConvertFailedException.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/4/12
 */
public class ConvertFailedException extends RuntimeException {

    public ConvertFailedException() {
        super("转换失败");
    }

    public ConvertFailedException(String message) {
        super((message == null || message.length() == 0) ? "转换失败" : message);
    }

}
