import java.util.*;

public class Member_database extends Object  {

	private List<Member> information;

	public Member_database(){
		information = new ArrayList<Member>();
	}

	public void addMember(Member m){
		information.add(m);
	}
	
	public void clear() {
		information.clear();
	}

	@Override
	public String toString() {
		String total = "\n";

		Iterator<Member> i = information.iterator();
		while(i.hasNext()){
			Member b = (Member) i.next();
			total = total + b.toString();
		}
		return total;
	}

}