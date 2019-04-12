package com.liumapp.simple.convert.converter;

import com.aspose.words.Document;
import com.aspose.words.DocumentBuilder;
import com.aspose.words.License;
import com.aspose.words.SaveFormat;
import com.liumapp.simple.convert.exceptions.CheckLicenseFailedException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * file BasicConverter.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/4/12
 */
public abstract class BasicConverter implements Converter {

    /**
     * check license info
     */
    protected void checkLicense() throws CheckLicenseFailedException {
        try {
            InputStream is = BasicConverter.class.getClassLoader().getResourceAsStream("license.xml");
            License aposeLic = new License();
            aposeLic.setLicense(is);
        } catch (Exception e) {
            throw new CheckLicenseFailedException();
        }
    }

}
