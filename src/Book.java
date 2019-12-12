public class Book {

	private int isbn;
	private String title, author;

	public Book(){
		isbn = 0;
		title = null;
		author = null;
	}

	public Book(int isbn, String title, String author){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString(){
		return "\nTitle: " + title + "\nAuthor: " + author +
				"\nISBN: " + isbn  + "\n";
	}

}