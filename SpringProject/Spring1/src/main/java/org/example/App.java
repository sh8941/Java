package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import  org.example.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop dt = context.getBean(Desktop.class);
        dt.compile();

        Alien obj1 = (Alien) context.getBean(Alien.class);
        obj1.code();
        System.out.println(obj1.getAge());




//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj1 = (Alien) context.getBean("alien");
//        obj1.code();
//        System.out.println(obj1.getAge());
//        Desktop com = context.getBean(Desktop.class);
    }
}
