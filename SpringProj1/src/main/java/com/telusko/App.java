package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien)context.getBean("Alien");
        obj.Code();
//        obj.setAge(23);
        System.out.println(obj.getAge());
        laptop l1 =(laptop)context.getBean("laptop");
        l1.Type();
    }
}
