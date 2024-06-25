package com.naresh.lms.view;


import java.util.Scanner;
import com.naresh.lms.model.Book;
import com.naresh.lms.model.Library;

import com.naresh.lms.controller.Controller;


public class View {

	static Scanner myInput = new Scanner(System.in);
	static Library library = new Library();
	static Controller controller = new Controller();
	
	static {
		
		//to perform startup Instruction
		System.out.println("============Welcome To My Library============");
		
		System.out.println("Enter library name:"+" ");
		String libraryName = myInput.nextLine();
		library.setLibraryName(libraryName);
		
		System.out.println("Enter library Addresss:"+" ");
		String libraryAddress = myInput.nextLine();
		library.setLibraryAddress(libraryAddress);
		
		System.out.println("Enter library pinCode:"+" ");
		int libraryPincode = myInput.nextInt();
		library.setPinCode(libraryPincode);
	}
	
	public static void main(String[] args) {
		do {
			System.out.println("Select 0peration To Perform");
			System.out.println("\n1.Add Book \n2.Remove Books\n3.Update Books\n4.Search Book By name\n5.Get all book");
			
			System.out.println("Enter a number of your choice:"+" ");
			
			
			int userChoice = myInput.nextInt();
			myInput.nextLine();
			
			switch(userChoice) {
			case 0:
				myInput.close();
				System.out.println("Exit");
				System.exit(0);
				break;
			case 1 :
				Book book1 = new Book();
				
				System.out.println("Enter Book Name");
				book1.setBookName(myInput.nextLine());
				
				System.out.println("Enter Book Auther Name");
				book1.setAutherName(myInput.nextLine());
				
				System.out.println("Enter Book Price");
				book1.setPrice(myInput.nextDouble());
				myInput.nextLine();
				
				System.out.println("Enter Book Publication Name");
				book1.setPublication(myInput.nextLine());
				
				controller.addBook(book1);
				break;
			case 2:
				System.out.println("Enter Book To Be removed ");
				String bookToBeremoved = myInput.nextLine();
				boolean flag = controller.removeBook(bookToBeremoved);
				if(flag) {
					System.out.println("Book Removed");
				}
				else {
					System.out.println("Book Not Exist");
				}
				break;
			case 3 :
				Book book3 = new Book();
				System.out.println("Enter Book Name To Update");
				String bookToBeUpdated = myInput.nextLine();
				book3.setBookName(bookToBeUpdated);
				
				System.out.println("Enter Price To Be Updated");
				double newPrice = myInput.nextDouble();
				book3.setPrice(newPrice);
				
				if(controller.updateBookPriceByBookName(book3))
					System.out.println("Book Price Updated");
				else
					System.out.println("Book Does Not Exist");
				break;
			case 4:
				System.out.println("Enter Book Name To Search");
				String bookToGet = myInput.nextLine();
				
				Book book = controller.searchBooks(bookToGet);
				if(book!=null)
					System.out.println(book.toString());
				else
					System.out.println("Book Not Exist");
				break;
			case 5 :
				System.out.println(controller.getAllBooks());
				break;
			default:
					break;
				
			}
		}while(true);
	}
}
