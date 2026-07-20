package com.library;
import com.library.BookRepository;
public class BookService {
    private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }
    public void showBooks(){
        bookRepository.display();
        System.out.println("from Service");
    }
}
