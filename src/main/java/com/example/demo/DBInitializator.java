package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Book;
import com.example.demo.jpa.same.BookRepository;

@Component
public class DBInitializator implements ApplicationListener<ApplicationReadyEvent> {

	@Autowired
	private BookRepository repository;

	/**
	 * This event is executed as late as conceivably possible to indicate that the
	 * application is ready to service requests.
	 */
	@Override
	public void onApplicationEvent(final ApplicationReadyEvent event) {

		Book book1 = new Book(1L, "Title 1", "Author1", "123");
		repository.save(book1);
		
		Book book2 = new Book(2L, "Title 2", "Author1", "1234");
		repository.save(book2);
		
		Book book3 = new Book(3L, "Title 2", "Author2", "1235");
		repository.save(book3);

		return;
	}
}