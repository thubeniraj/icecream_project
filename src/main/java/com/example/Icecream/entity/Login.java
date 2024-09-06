package com.example.Icecream.entity;

public class Login {
private String username;
private String email;
private String password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public Login() {
	
}
public Login(String username, String email, String password) {
	
	this.username = username;
	this.email = email;
	this.password = password;
}

@Override
public String toString() {
	return "Login [username=" + username + ", email=" + email + ", password=" + password + "]";
}

}
