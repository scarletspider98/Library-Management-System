public class Member {

	private int IDNum;
	private String Name, Email;

	public Member(){
		IDNum = 0;
		Name = null;
		Email = null;
	}

	public Member(int IDNum, String Name, String Email){
		this.IDNum = IDNum;
		this.Name = Name;
		this.Email = Email;
	}

	@Override
	public String toString(){
		return "\nName: " + Name + "\nEmail: " + Email +
				"\nIDNum: " + IDNum  + "\n";
	}

}