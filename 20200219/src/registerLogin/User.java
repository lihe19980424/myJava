package registerLogin;


public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}






	public String getUserName() {
		return userName;
	}






	public void setUserName(String userName) {
		this.userName = userName;
	}






	public String getPassWord() {
		return passWord;
	}






	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public String getEmail() {
		return email;
	}






	public void setEmail(String email) {
		this.email = email;
	}






	public User(String userName, String passWord, String name, String email) {
		this.userName = userName;
		this.passWord = passWord;
		this.name = name;
		this.email = email;
	}






	@Override
	public String toString() {
		return "User [userName=" + userName + ", passWord=" + passWord + ", name=" + name + ", email=" + email + "]";
	}






	private String userName;


	private String passWord;


	private String name;


	private String email;



}