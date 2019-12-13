package fr.cormier.formation.spring._012;

import fr.cormier.formation.spring.dao.FormationDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main012 {

    public static void main(final String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext_012.xml");
        FormationDao formationDao1 = applicationContext.getBean(FormationDao.class);
        FormationDao formationDao2 = applicationContext.getBean(FormationDao.class);

        System.out.println(formationDao1 == formationDao2);

    }

}
