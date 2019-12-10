package fr.cormier.formation.spring._002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main002 {

    public static void  main(final String[] args){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext_002.xml");
        applicationContext.setDisplayName("Context d'application");
        Monbean bean = applicationContext.getBean(Monbean.class);
        bean.helloWorld();
        }
    }


