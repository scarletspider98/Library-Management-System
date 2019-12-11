import java.util.*;

public class MainSystem {

	static String fileName = null;
	static Library lib = new Library();
	static Member_database mem = new Member_database();
	static Scanner in = new Scanner(System.in);
	static Boolean running = true;

	public static void main(String[] args) {
		while (running) {
			System.out.println("Welcome to the Library Management System!");
			System.out.println("\nEnter '1' to add a book to the library."
					+ "\nEnter '2' to list all books in the library."
					+ "\nEnter '3' to add a member to the library."
					+ "\nEnter '4' to list all the members in the library."
			       + "\nEnter '5' to check the availability of study rooms in the library.");
			
			int answer = in.nextInt();
			switch (answer) {
			case 1:
				addBook();
				break;
			case 2:
				System.out.println(lib.toString());
				break;	
			case 3:
				addMember();
				break;	
			case 4:
				System.out.println(mem.toString());
				break;	
			case 5: 
				Room.init_rooms();
				System.out.println();
			}
		}
		System.exit(0);
	}

	private static void addBook() {
		int isbn;
		String title, author;

		System.out.println("\nEnter Title: ");
		title = in.next();

		System.out.println("\nEnter Author: ");
		author = in.next();

		System.out.println("\nEnter ISBN: ");
		isbn = in.nextInt();

		Book b = new Book(isbn, title, author);
		lib.addBook(b);
	}
	
	private static void addMember() {
		int IDNum;
		String Name, Email;

		System.out.println("\nEnter Name: ");
		Name = in.next();

		System.out.println("\nEnter Email: ");
		Email = in.next();

		System.out.println("\nEnter IDNum: ");
		IDNum = in.nextInt();

		Member m = new Member(IDNum, Name, Email);
		mem.addMember(m);
	}
}
	
