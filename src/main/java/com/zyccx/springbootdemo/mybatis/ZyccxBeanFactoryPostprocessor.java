package com.zyccx.springbootdemo.mybatis;

import com.zyccx.springbootdemo.service.TestService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @Classname ZyccxBeanFactoryPostprocessor
 * @Description TODO
 * @Date 2019/9/28 23:18
 * @Created by Zhangyichao
 */
@Component
public class ZyccxBeanFactoryPostprocessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        GenericBeanDefinition c = (GenericBeanDefinition) beanFactory.getBeanDefinition("c");
//        // System.out.println(c.getBeanClass());
        System.out.println("ddd");
        System.out.println(c.getBeanClassName());
        c.setBeanClass(TestService.class);
    }
}
