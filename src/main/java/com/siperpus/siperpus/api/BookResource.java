package com.siperpus.siperpus.api;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.siperpus.siperpus.entity.Book;
import com.siperpus.siperpus.services.BookService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BookResource {

    private final BookService bookService;

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getListBook() {
        return ResponseEntity.ok().body(bookService.getBooks());
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBook(@PathVariable Long Id) {
        return ResponseEntity.ok().body(bookService.getBook(Id));
    }

    @PostMapping("/book/save")
    public ResponseEntity<Book> saveBook(@RequestBody Book book) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/books/save").toUriString()); 
        return ResponseEntity.created(uri).body(bookService.saveBook(book));
    }

    @DeleteMapping("/book/{id}")
    public void deleteBook(@PathVariable Long Id) {
        bookService.deleteBook(Id);
    }
    
}
