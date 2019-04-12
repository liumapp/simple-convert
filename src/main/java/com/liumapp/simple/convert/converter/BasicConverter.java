package com.liumapp.simple.convert.converter;

import com.aspose.words.License;
import com.liumapp.simple.convert.exceptions.CheckLicenseFailedException;

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
     * @return boolean
     */
    protected boolean checkLicense() throws CheckLicenseFailedException {
        boolean result = false;
        try {
            InputStream is = BasicConverter.class.getClassLoader().getResourceAsStream("license.xml");
            License aposeLic = new License();
            aposeLic.setLicense(is);
            result = true;
        } catch (Exception e) {
            throw new CheckLicenseFailedException();
        }
        return result;
    }

    public void convertByFilePath(String sourcePath, String destPath) {

    }

    public OutputStream convertByStream(InputStream inputStream) {
        return null;
    }

    public String convertByBase64(String sourceBase64) {
        return null;
    }
}
