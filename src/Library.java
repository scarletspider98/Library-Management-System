import java.util.*;

public class Library extends Object  {

	private List<Book> collection;

	public Library(){
		collection = new ArrayList<Book>();
	}

	public void addBook(Book b){
		collection.add(b);
	}
	
	public void clear() {
		collection.clear();
	}

	@Override
	public String toString() {
		String total = "\n";
		Iterator<Book> i = collection.iterator();
		while(i.hasNext()){
			Book b = (Book) i.next();
			total = total + b.toString();
		}
		return total;
	}

}