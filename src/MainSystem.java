import java.util.*;

public class MainSystem {

	static String fileName = null;
	static Library lib = new Library();
	static Member_database mem = new Member_database();
	static Scanner in = new Scanner(System.in);
	static Boolean running = true;

	public static void main(String[] args) {
		while (running) {
			System.out.println("\nEnter 1 for add book to library "
					+ "\nEnter 2 for list all books in library"
					+ "\nEnter 3 for add member to library"
					+ "\nEnter 4 for list all members in library");
			
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
	
