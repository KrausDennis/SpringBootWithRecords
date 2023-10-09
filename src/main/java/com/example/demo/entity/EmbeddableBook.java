package com.example.demo.entity;

import java.util.Objects;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Since Hibernate 6.2
 */
@Entity
@Table(name = "embeadable_author_book")
public class EmbeddableBook {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	
	@Embedded
	private Author author;
	
	private String isbn;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, id, isbn, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmbeddableBook other = (EmbeddableBook) obj;
		return Objects.equals(author, other.author) && Objects.equals(id, other.id) && Objects.equals(isbn, other.isbn)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "EmbeddableBook [id=" + id + ", title=" + title + ", author=" + author + ", isbn=" + isbn + "]";
	}

}