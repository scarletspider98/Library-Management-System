import java.util.*;
//change

public class Library extends Object  {
	
	private List<Book> collection;

	public Library(){
		collection = new ArrayList<Book>();
	}
	
	public void addBook(Book book){
		collection.add(book);
	}
	
	@Override
	public String toString() {
		String total = "\n";
		/*
		for (int i=0; i<collection.size(); i++){
			Book b = collection.get(i);
			total = total + b.toString();
			
		}
		*/
		Iterator<Book> i = collection.iterator();
		while(i.hasNext()){
			Book b = (Book) i.next();
			total = total + b.toString();
		}
		return total;
	}

}
