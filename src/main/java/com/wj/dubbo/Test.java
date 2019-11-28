package com.wj.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        DemoService demoService = (DemoService)context.getBean("demoService");

        System.out.println(demoService.sayHello("jaha"));
System.in.read();

    }
}
