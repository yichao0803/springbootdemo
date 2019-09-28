package com.zyccx.springbootdemo.test;

import com.zyccx.springbootdemo.app.Appconfig;
import com.zyccx.springbootdemo.service.CityService;
import com.zyccx.springbootdemo.service.TestService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2019/9/28 22:56
 * @Created by Zhangyichao
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationConntext
                =new AnnotationConfigApplicationContext(Appconfig.class);
        System.out.println(annotationConfigApplicationConntext.getBean(TestService.class));

        //System.out.println(annotationConfigApplicationConntext.getBean(CityService.class));

        //GenericBeanDefinition genericBeanDefinition;
       // genericBeanDefinition = (GenericBeanDefinition)annotationConfigApplicationConntext.getBeanDefinition(CityService.class);
    }
}
