package entity;

public class Employee extends User{
	private int projectID;
	private String proSkill;
	
	public String getProSkill() {
		return proSkill;
	}

	public Employee() {
		super();
	}

	public Employee(int id, String fullname, String pw,String proSkill) {
		super(id, fullname, pw);
		this.proSkill = proSkill;
	}
	public void setProskill(String proSkill) {
		this.proSkill = proSkill;
	}

	public int getProjectID() {
		return projectID;
	}

	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}
}
