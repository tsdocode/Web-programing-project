package model;

import utilities.CryptWithMD5;

public class User {
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private String email;
	private String phone;
	private String description;

	private CryptWithMD5 crypt = new CryptWithMD5();

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// Encrypt with MD5.It returns encrypted output

	public User() {
	}

	public User(String email, String password) {
		this.email = email;
		//
		this.password = crypt.cryptWithMD5(password);
	}

	public User(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = crypt.cryptWithMD5(password);
	}

	public User(String firstname, String lastname, String username, String password, String email, String phone,
			String description) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = crypt.cryptWithMD5(password);
		this.email = email;
		this.phone = phone;
		this.description = description;
	}
}
