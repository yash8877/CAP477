public class User {
	//write your code here
	private String name;
	private String mobileNumber;
	private String username;
	private String password;

	public User(String name, String mobileNumber, String username, String password) {
		this.name = name.trim();
		this.mobileNumber = mobileNumber.trim();
		this.username = username.trim();
		this.password = password.trim();
	}

	public String getName() {
		return this.name;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public String getUsername() {
		return this.username;
	}

	public String getPassword() {
		return this.password;
	}
}