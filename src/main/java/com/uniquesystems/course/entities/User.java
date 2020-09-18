package com.uniquesystems.course.entities;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;

	private long id;
	private String name;
	private String email;
	private String phone;
	private String passoword;
	
	public User() {
		
	}

	public User(long id, String name, String email, String phone, String passoword) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.passoword = passoword;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassoword() {
		return passoword;
	}

	public void setPassoword(String passoword) {
		this.passoword = passoword;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}

}