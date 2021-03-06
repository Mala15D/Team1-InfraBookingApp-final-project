package com.infrabookingapp.entity;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NonNull
	private String email;
	private String password;
	
	@ElementCollection
	private List<Role> roles;
	
	
	public Employee(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public Employee() {
		super();
	}
	public Employee(int id) {
		super();
		this.id = id;
	}
	public Employee(String email, String password, List<Role> roles) {
		super();
		this.email = email;
		this.password = password;
		this.roles = roles;
	}
	public Employee(int id, String email, String password, List<Role> roles) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", email=" + email + ", password=" + password + ", roles=" + roles + "]";
	}
}
