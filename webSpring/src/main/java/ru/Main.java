package ru;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.config.NewConfig;
import ru.dao.HotelDaoCrudImpl;


public class Main {

    public static void main(String[] args) {


        ApplicationContext beanF = new AnnotationConfigApplicationContext(NewConfig.class);
        System.out.println(  beanF.getBean(HotelDaoCrudImpl.class).findOne(2).getName());

    }
}
