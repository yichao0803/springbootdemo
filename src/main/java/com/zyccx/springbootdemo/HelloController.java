package com.zyccx.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhangyichao
 * @Classname HelloController
 * @Description HelloController 测试
 * @Date 2019/9/28 22:50
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String say() {
        return "Hello World！";
    }
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
