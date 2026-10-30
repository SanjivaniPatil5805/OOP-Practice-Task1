package com.practice;

public class LibraryBook {
	
	private int bookId;
	private String title;
	private String author;
	
	public LibraryBook(int bookId, String title, String author) {
		
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		
	}
		public int getBookId() {
			
			return bookId;
			
		}
		
		public String getTitle() {
			
			return title;
			
		}
		
		public String author() {
			
			return author;
			
		}
		
		public void display() {
			
			System.out.println("Book ID = "+bookId);
			System.out.println("Book Title = "+title);
			System.out.println("Author = "+author);
			System.out.println();
			
		}

}
