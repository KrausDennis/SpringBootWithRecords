package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.jpa.custom.CustomBookRecord;
import com.example.demo.jpa.custom.CustomBookRepository;
import com.example.demo.jpa.same.BookRecord;
import com.example.demo.jpa.same.BookRepository;

@Service
public class BookService {

	private final CustomBookRepository customBookRepository;
	
	private final BookRepository bookRepository;
	
	BookService(CustomBookRepository customBookRepository, BookRepository bookRepository) {
		this.customBookRepository = customBookRepository;
		this.bookRepository = bookRepository;
	}
	
	public List<CustomBookRecord> findAllBooks() {
		return customBookRepository.findAllBooks();
	}
	
	public BookRecord findById(Long id) {
		return bookRepository.findBookById(id);
	}
	
}
