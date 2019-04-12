package com.liumapp.simple.convert.exceptions;

import org.omg.SendingContext.RunTime;

/**
 * file CheckLicenseFailedException.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/4/12
 */
public class CheckLicenseFailedException extends RuntimeException {

    public CheckLicenseFailedException() {
        super("校验asponse的license失败，您可能需要在license.xml文件中更换最新的注册信息");
    }

    public CheckLicenseFailedException(String message) {
        super((message == null || message.length() == 0) ? "校验asponse的license失败，您可能需要在license.xml文件中更换最新的注册信息" : message);
    }
}
