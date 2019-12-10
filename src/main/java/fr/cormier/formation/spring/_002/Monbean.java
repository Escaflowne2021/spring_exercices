package fr.cormier.formation.spring._002;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Monbean implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public void helloWorld(){
        System.out.println("hello world from my bean from "+this.applicationContext.getDisplayName());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
     this.applicationContext = applicationContext;
    }
}
