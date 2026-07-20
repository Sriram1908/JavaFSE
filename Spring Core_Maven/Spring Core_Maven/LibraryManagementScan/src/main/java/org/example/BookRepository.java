package org.example;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void display(){
        System.out.println("From Repo");
    }
}
