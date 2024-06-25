package com.naresh.lms.controller;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

import com.naresh.lms.model.Book;
import com.naresh.lms.model.Library;

public class Controller
{
Library library = new Library();
	
	public void addBook(Book book) {
		
		List<Book> books =  library.getBooks();
		if(books == null){
			System.out.println("inside add books");
			books = new ArrayList<>();
			library.setBooks(books);
		}
		books.add(book);
	}
	
	
	public Book searchBooks(String bookName) {
		List<Book> books = library.getBooks();
		
		Iterator<Book> iterator = books.iterator();
		
		while(iterator.hasNext())
		{
			Book book  =iterator.next();
			if(book.getBookName().equalsIgnoreCase(bookName))
				return book;	
		}
		return null;	
	}
	
	public boolean removeBook(String bookName) {
		Book book = searchBooks(bookName);
		if(book!=null){
			List<Book> books = library.getBooks();
			books.remove(book);
			return true;
		}
		return false;
	}

	
	public boolean updateBookPriceByBookName(Book refBook) {
		Book book = searchBooks(refBook.getBookName());
		if(book!=null) {
			book.setPrice(refBook.getPrice());
			return true;
		}
		return false;
	}
	
	public List<Book> getAllBooks(){
		return library.getBooks();
	}
}
