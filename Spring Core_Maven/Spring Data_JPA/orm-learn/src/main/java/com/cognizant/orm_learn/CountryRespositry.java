package com.cognizant.orm_learn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRespositry extends JpaRepository<Country,String> {

}
