import java.util.*;
//change
public class MainSystem {

	static String fileName = null;
	static Library lib = new Library();
	static Member_database mem = new Member_database();
	static Scanner in = new Scanner(System.in);
	static Boolean running = true;

	public static void main(String[] args) {
		while (running) {
			System.out.println("\nEnter 1 for add book to library "
					+ "\nEnter '2' for list all books in library"
					+ "\nEnter '3' for add member to library"
					+ "\nEnter '4' for list all members in library"
			       + "\nEnter '5' to check the availability of study rooms in the library");
			
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
		// TODO Auto-generated method stub
		int isbn;
		String title, author;

		System.out.println("\nEnter Title: ");
		title = in.next();

		System.out.println("\nEnter Author: ");
		author = in.next();

		System.out.println("\nEnter ISBN: ");
		isbn = in.nextInt();

	/*	System.out.println("\nEnter Price: ");
		price = in.nextDouble();
*/
		Book b = new Book(isbn, title, author);
		lib.addBook(b);
	}
	
	private static void addMember() {
		// TODO Auto-generated method stub
		int IDNum;
		String Name, Email;

		System.out.println("\nEnter Name: ");
		Name = in.next();

		System.out.println("\nEnter Email: ");
		Email = in.next();

		System.out.println("\nEnter IDNum: ");
		IDNum = in.nextInt();

	/*	System.out.println("\nEnter Price: ");
		price = in.nextDouble();
	 */
		Member m = new Member(IDNum, Name, Email);
		mem.addMember(m);
	}
	
	
	
/*
	private static void saveAndQuit() {
		// TODO Auto-generated method stub
		System.out.println("Enter file name: ");
		fileName = in.next() + ".ser";
		running = false;
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
			fos = new FileOutputStream(fileName);
			out = new ObjectOutputStream(fos);
			out.writeObject(lib);
			fos.close();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
*/
/*	private static void loadScript(String name) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		ObjectInputStream in = null;
		File file = new File(name + ".ser");
		if (file.exists()) {
			try {
				fis = new FileInputStream(file);
				in = new ObjectInputStream(fis);
				lib = (Library) in.readObject();
				fis.close();
				in.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("\nThe file does not exist!");
		}
	}
*/
}
