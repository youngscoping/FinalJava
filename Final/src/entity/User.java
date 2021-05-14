package entity;

public class User {
private int id;
private String fullname;
private String pw;
private String email;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "User [id=" + id + ", fullname=" + fullname + ", pw=" + pw + "]";
}
public User() {
}

public User(int id, String fullname, String email) {
	this.id = id;
	this.fullname = fullname;
	this.email = email;
}
public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
}
public String getPw() {
	return pw;
}
public void setPw(String pw) {
	this.pw = pw;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
