package com.cognizant.orm_learn;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class CountryService {
    @Autowired
    private CountryRespositry countryRespositry;

    @Transactional
    public List<Country> getAllCountries(){
        return countryRespositry.findAll();
    }

    @Transactional
    public void addCountryByJPA(Country country){
        countryRespositry.save(country);
    }
}
