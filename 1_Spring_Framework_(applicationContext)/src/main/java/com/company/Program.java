package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Class_Get_Bean class_get_bean = context.getBean("get_bean_from_xml", Class_Get_Bean.class);

        System.out.println(class_get_bean.getName());

        context.close();
    }
}
