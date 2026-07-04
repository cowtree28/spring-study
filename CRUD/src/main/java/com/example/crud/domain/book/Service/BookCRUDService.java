package com.example.crud.domain.book.Service;

import com.example.crud.domain.book.domain.Book;
import com.example.crud.domain.book.domain.Repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookCRUDService {
    private final BookRepository bookRepository; // 의존성 주입

    public BookCRUDService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book bookDetails) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        book.setTitle(bookDetails.getTitle());
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
