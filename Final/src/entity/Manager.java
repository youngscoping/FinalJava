package entity;

public class Manager extends User {
	int expYear;

	public int getExpinyear() {
		return expYear;
	}


	public void setExpinyear(int expYear) {
		this.expYear = expYear;
	}

	public Manager(int id,String fullname,String email, int expYear) {
		super (id, fullname, email);
		this.expYear = expYear;
	}

	public Manager() {
		super();
	}
	
}
