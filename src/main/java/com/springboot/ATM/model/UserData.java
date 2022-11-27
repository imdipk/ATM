package com.springboot.ATM.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserData {
	private String name;
	
	@Column(nullable = false, unique = true, length = 45)
	private String email;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long number;
	private long password;
	private String bank;
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
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public long getPassword() {
		return password;
	}
	public void setPassword(long password) {
		this.password = password;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	@Override
	public String toString() {
		return "UserData [name=" + name + ", email=" + email + ", number=" + number + ", password=" + password
				+ ", bank=" + bank + "]";
	}
	
}
