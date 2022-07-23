package com.siperpus.siperpus.services;

import java.util.List;

import com.siperpus.siperpus.entity.Book;

public interface BookService {

    /**
     * @param book
     * @return
     */
    Book saveBook(Book book);

    /**
     * @return
     */
    List<Book> getBooks();

    /**
     * @return
     */
    Book getBook(Long id);

    /**
     * @param Id
     */
    void deleteBook(Long Id);
    
}
