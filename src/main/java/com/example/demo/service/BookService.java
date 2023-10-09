package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.CustomBookRecord;
import com.example.demo.jpa.same.BookRecord;
import com.example.demo.jpa.same.BookRepository;

@Service
public class BookService {

	private final BookRepository bookRepository;
	
	BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public List<CustomBookRecord> findAllBooks() {
		return bookRepository.findAllBooks();
	}
	
	public BookRecord findById(Long id) {
		return bookRepository.findBookById(id);
	}
	
}
