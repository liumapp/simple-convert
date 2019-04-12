package com.liumapp.simple.convert.converter;

import com.liumapp.simple.convert.exceptions.CheckLicenseFailedException;

/**
 * file Converter.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/4/12
 */
public interface Converter {

    /**
     * 检查license.xml的合法性
     * @throws CheckLicenseFailedException while check license.xml failed
     */
    public void checkLicense() throws CheckLicenseFailedException;

}
