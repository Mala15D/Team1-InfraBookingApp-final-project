package com.infrabookingapp.entity;

import java.util.Objects;

public class LoginUser {
	private String email;
	private String password;
	
	public LoginUser(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	public LoginUser() {
		super();
	}

	public LoginUser(String userName) {
		super();
		this.email = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String userName) {
		this.email = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginUser [email=" + email + ", password=" + password + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof LoginUser))
			return false;
		LoginUser other = (LoginUser) obj;
		return Objects.equals(email, other.email);
	}
	
	
}
