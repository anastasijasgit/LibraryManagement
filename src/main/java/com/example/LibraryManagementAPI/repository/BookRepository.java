package com.example.LibraryManagementAPI.repository;

import com.example.LibraryManagementAPI.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
