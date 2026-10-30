package com.practice;

public class LibraryBookMain {

	public static void main(String[] args) {

		LibraryBook l1 = new LibraryBook(111, "The Guide", "R. K. Narayan");
		LibraryBook l2 = new LibraryBook(222, "The God of Small Things", "Arundhati Roy");
		LibraryBook l3 = new LibraryBook(333, "Wings of Fire", "Abdul Kalam");
		
		l1.display();
		l2.display();
		l3.display();
		

	}

}
