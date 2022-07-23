package com.siperpus.siperpus.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.siperpus.siperpus.entity.Book;
import com.siperpus.siperpus.repository.BookRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class BookServiceImp implements BookService {

    private BookRepository bookRepository;

    @Override
    public Book saveBook(Book book) {
        // TODO Auto-generated method stub
        log.info("save book to database : {}", book);
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getBooks() {
        // TODO Auto-generated method stub
        log.info("get list book from database ");
        return bookRepository.findAll();
    }

    @Override
    public Book getBook(Long Id) {
        // TODO Auto-generated method stub
        log.info("get book by id : {}", Id);
        return bookRepository.findById(Id).get();
    }

    @Override
    public void deleteBook(Long Id) {
        // TODO Auto-generated method stub
        log.info("Delete Book by id");
        bookRepository.deleteById(Id);
        
    }
    
}
