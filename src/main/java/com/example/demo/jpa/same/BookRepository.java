package com.example.demo.jpa.same;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Book;

/**
 * Spring Data Repositories allow us to use records as the return type of the
 * methods in the repository. This will automatically map the entity to the
 * record. This is only possible if the record has exactly the same fields as
 * the entity.
 * 
 * Since the BookRecord has the same fields as the Book entity, Spring Data JPA
 * will automatically map the entity to the record and return a list of records
 * instead of a list of entities when we call the findBookByAuthor() method.
 */
public interface BookRepository extends JpaRepository<Book, Long> {
	// TODO: Create a method returning a list of BookRecords by author without a
	// query annotation

	// TODO: Create a method returning a BookRecords by id with a query annotation

	// TODO: Create a method returning a list of all books as CustomBookRecords with
	// a query annotation
}