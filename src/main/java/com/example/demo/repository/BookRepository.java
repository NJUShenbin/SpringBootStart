package com.example.demo.repository;

import com.example.demo.vo.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {

    List<BookEntity> findByLanguage(String language);
    List<BookEntity> findByAuthorAndLanguage(String author, String language);

}
