package entity;

public class Project {
	private int projectId;
	private String fullname;
	public Project() {
	}
	private String role;
	public Project(int projectId, String fullname, String role) {
		this.projectId = projectId;
		this.fullname = fullname;
		this.role = role;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
