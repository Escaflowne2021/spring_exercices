package fr.cormier.formation.spring._003;

import fr.cormier.formation.spring.service.FormationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main003 {

    public static void main(final String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext_003.xml");
        FormationService service = applicationContext.getBean(FormationService.class);
        System.out.println(service.findAll());
    }

}
