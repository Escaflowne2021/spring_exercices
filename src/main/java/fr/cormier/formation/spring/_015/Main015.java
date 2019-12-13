package fr.cormier.formation.spring._015;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main015 {
    public static void main (final String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext_015.xml");
        Log log = (Log) applicationContext.getBean("log");


        log.Log("Coool");
        log.Parle();
    }
}
