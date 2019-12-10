package fr.cormier.formation.spring._008;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main008 {

    public final static void main(final String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext_008.xml");
        MaClasseSingleton singleton = applicationContext.getBean(MaClasseSingleton.class);
        singleton.QuiSuije();

    }
}
