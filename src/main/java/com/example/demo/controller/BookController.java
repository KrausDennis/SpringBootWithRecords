package com.example.demo.controller;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jpa.custom.CustomBookRecord;
import com.example.demo.jpa.same.BookRecord;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("books")
@Validated
public class BookController {

	private final BookService bookService;

	BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping
	public List<CustomBookRecord> getAll() {
		return bookService.findAllBooks();
	}

	@GetMapping("/{id}")
	public BookRecord getBook(@PathVariable long id) {
		return bookService.findById(id);
	}

}
