package com.michael.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * 以前写在配置文件中的一些参数，可以写在配置文件中直接获取
 */
@Component
public class SysPropetiesBean {

    @Value("${com.michael.properties.syspropetiesbean.basicpath}")
    private String basicPath;

    @Value("${com.michael.properties.syspropetiesbean.tips}")
    private String tips;

    @Value("${com.michael.properties.syspropetiesbean.batchsize}")
    private String batchSize;

    public String getBasicPath() {
        return basicPath;
    }

    public void setBasicPath(String basicPath) {
        this.basicPath = basicPath;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public String getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(String batchSize) {
        this.batchSize = batchSize;
    }
}
