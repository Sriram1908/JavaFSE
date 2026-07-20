package com.cognizant.orm_learn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.jpa.provider.HibernateUtils;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {
	private static CountryService countryService;
	private static final Logger logger= LoggerFactory.getLogger(OrmLearnApplication.class);
	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(OrmLearnApplication.class);
		logger.info("inside main");
		countryService=(CountryService)context.getBean(CountryService.class);
		testGetAllCountries();

	}

	private static void testGetAllCountries(){
		logger.info("Start");
		List<Country> countries=countryService.getAllCountries();
		logger.debug("countries={}",countries);
		logger.info("End");

		//Example 3 for difference of JPA and Hibernate
		logger.info("Start");
		Country Russia =new Country();
		Russia.setCode("RU");Russia.setName("RUSSIA");
		countryService.addCountryByJPA(Russia);
		logger.info("End");
	}

}
