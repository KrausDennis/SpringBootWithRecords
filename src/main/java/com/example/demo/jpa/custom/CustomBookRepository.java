package com.example.demo.jpa.custom;

import java.util.List;

public interface CustomBookRepository {
    List<CustomBookRecord> findAllBooks();
}