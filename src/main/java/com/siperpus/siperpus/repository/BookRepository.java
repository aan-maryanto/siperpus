package com.siperpus.siperpus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siperpus.siperpus.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}
