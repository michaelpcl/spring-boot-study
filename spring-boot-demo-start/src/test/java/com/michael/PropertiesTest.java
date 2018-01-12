package com.michael;

import com.michael.properties.SysPropetiesBean;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {
    @Autowired
    private SysPropetiesBean sysPropetiesBean;

    @Test
    public void propertiesTest() {
        Assert.assertEquals(sysPropetiesBean.getBasicPath(),"/opt/spider/");
    }

    @Test
    public void myTest(){
        System.out.println(sysPropetiesBean.getBasicPath()+"*******"+sysPropetiesBean.getTips()+"*********"+sysPropetiesBean.getBatchSize());
    }


}
