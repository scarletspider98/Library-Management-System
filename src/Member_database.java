import java.util.*;
//change

public class Member_database extends Object  {
	
	private List<Member> collection;

	public Member_database(){
		collection = new ArrayList<Member>();
	}
	
	public void addMember(Member book){
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
		Iterator<Member> i = collection.iterator();
		while(i.hasNext()){
			Member b = (Member) i.next();
			total = total + b.toString();
		}
		return total;
	}

}
