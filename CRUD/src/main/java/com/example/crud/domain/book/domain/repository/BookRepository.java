package com.example.crud.domain.book.domain.repository;

import com.example.crud.domain.book.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {ㄹ
}
