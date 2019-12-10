package fr.cormier.formation.spring._005;

import fr.cormier.formation.spring.service.FormationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class Main005 {

    public static void main(final String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext_005.xml");
        FormationService service = applicationContext.getBean(FormationService.class);
        //personne pers = applicationContext.getBean(personne.class);
        Map<String,personne> beans = applicationContext.getBeansOfType(personne.class);
        beans.entrySet().stream().forEach(b -> System.out.println(b));
    }

}
