package org.example;

import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.slf4j.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Logger logger= (Logger) LoggerFactory.getLogger(Main.class);
    public static void main(String[] args){
        logger.info("Start");
        ApplicationContext context=new ClassPathXmlApplicationContext("Country.xml");
        Country in=(Country) context.getBean(Country.class);
        in.setCode("IN");
        in.setName("India");
        in.display();
        logger.debug("Country :{}",in.toString());
        logger.info("End");
    }
}