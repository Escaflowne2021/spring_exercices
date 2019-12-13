package fr.cormier.formation.spring._008;

import org.springframework.context.annotation.Bean;

public class Factory {

    public BeanACreer create(){
        return new BeanACreer();
    }

}
