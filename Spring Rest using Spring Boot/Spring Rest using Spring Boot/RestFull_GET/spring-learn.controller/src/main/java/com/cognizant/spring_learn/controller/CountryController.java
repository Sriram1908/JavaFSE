package com.cognizant.spring_learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class CountryController {
    @Autowired
    private ArrayList<Country> list;

    @Autowired
    @Qualifier("india")
    private Country india;


    @GetMapping("/countries/{code}")
    public Optional<Country> getCountry(@PathVariable String code){
        Optional<Country> country =list.stream().filter(c->c.getCode().equals(code)).findFirst();
        return country;
    }
    @GetMapping("/country")
    public Country getCountryIndia(){
        return india;
    }
    @GetMapping("/countries")
    public ArrayList<Country> getAllCountries(){
        return list;
    }
}
