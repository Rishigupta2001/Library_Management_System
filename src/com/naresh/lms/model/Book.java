package com.naresh.lms.model;

public class Book
{

	//Class Data Members
		private String bookName;
		private String AutherName;
		private String publication;
		private double price;
		
		// Getter and Setter Method 
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getAutherName() {
			return AutherName;
		}
		public void setAutherName(String autherName) {
			AutherName = autherName;
		}
		public String getPublication() {
			return publication;
		}
		public void setPublication(String publication) {
			this.publication = publication;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		@Override
		public String toString() {
			return "Book [bookName=" + bookName + ", AutherName=" + AutherName + ", publication=" + publication + ", price="
					+ price + "]";
		}

}
