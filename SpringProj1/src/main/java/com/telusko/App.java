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
       System.out.println(obj.getAge());

//        obj.setAge(23);
//        System.out.println(obj.getAge());
        laptop l1 =(laptop)context.getBean("laptop2");
        Desktop desktop =(Desktop)context.getBean("comp");
//        l1.Type();
    }
}
