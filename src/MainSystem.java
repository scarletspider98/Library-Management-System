import java.util.*;

public class MainSystem {

	static String fileName = null;
	static Library lib = new Library();
	static Member_database mem = new Member_database();
	static Scanner in = new Scanner(System.in);
	static Boolean running = true;

	public static void main(String[] args) {
		while (running) {
			System.out.println("\nWelcome to the Library Management System!");
			System.out.println("\nEnter '1' to add a book to the library."
					+ "\nEnter '2' to list all books in the library."
					+ "\nEnter '3' to add a member to the library."
					+ "\nEnter '4' to list all the members in the library."
					+ "\nEnter '5' to check the availability of study rooms in the library."
					+ "\nEnter '6' to clear both the books list and the members list.");

			int answer = -1;
			//error checking: invalid integer input/inputting numbers other than 1-5
			try {
				answer = in.nextInt();
			} catch(Exception e) { 
				System.out.println("Please enter a valid integer.");
				in.next();
			}
			if(answer <= 0 || answer > 6) {
				System.out.println("Enter an Intger 1 through 5");
			}

			switch (answer) {
			//adding a book
			case 1:
				addBook();
				break;
				//listing all the added books
			case 2:
				System.out.println(lib.toString());
				break;	
				//adding members to the library
			case 3:
				addMember();
				break;	
				//listing all the members that were added
			case 4:
				System.out.println(mem.toString());
				break;	
				//randomly generated study room availabilities 
			case 5: 
				Room.init_rooms();
				for(int  i = 0; i < Room.rooms.length; i++) {
					System.out.println(Room.rooms[i]);
				}
			case 6:
				lib.clear();
				mem.clear();
				System.out.println("\n\nLists cleared!");
				break;
			}
			//Print line that goes at the end of every case input because of default console size
			System.out.println("SCROLL UP! to see user input/output");
		}
		System.exit(0);
	}

	private static void addBook() {
		int isbn = 0000;
		String title, author;

		System.out.println("\nEnter Title: ");
		title = in.next();

		System.out.println("\nEnter Author: ");
		author = in.next();

		System.out.println("\nEnter ISBN: ");
		//error checking: entering only numbers for ISBN
		try {
			isbn = in.nextInt();
		} catch (Exception e) {
			System.out.println("Please enter numbers, no other characters.");
		}
		Book b = new Book(isbn, title, author);
		lib.addBook(b);
	}

	private static void addMember() {
		int IDNum = 0000;
		String Name, Email;

		System.out.println("\nEnter Name: ");
		Name = in.next();

		System.out.println("\nEnter Email: ");
		Email = in.next();

		System.out.println("\nEnter IDNum: ");
		//error checking: entering only numbers for member ID
		try {
			IDNum = in.nextInt();
		} catch (Exception e) {
			System.out.println("Please enter numbers, no other characters.");
		}

		Member m = new Member(IDNum, Name, Email);
		mem.addMember(m);
	}
}