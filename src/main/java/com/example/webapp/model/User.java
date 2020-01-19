package com.example.webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotNull
	@Column(name="id")
	private int id;
	@Size(min = 1, max = 45)
	@NotNull
	@Column(name="name")
	private String name;
	@Size(min = 1, max = 45)
	@NotNull
	@Column(name="surname")
	private String surname;
	@Size(min = 1, max = 45)
	@NotNull
	@Column(name="birth_date")
	private String birthDate;
	@Size(min = 1, max = 45)
	@NotNull
	@Column(name="user_name",unique=true)
	private String userName;
	@Size(min = 1, max = 45)
	@NotNull
	@Column(name="password")
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public User(@NotNull int id, @Size(min = 1, max = 45) @NotNull String name,
			@Size(min = 1, max = 45) @NotNull String surname, @Size(min = 1, max = 45) @NotNull String birthDate,
			@Size(min = 1, max = 45) @NotNull String userName, @Size(min = 1, max = 45) @NotNull String password) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", surname=" + surname + ", birthDate=" + birthDate + ", userName="
				+ userName + ", password=" + password + "]";
	}

	public User(String name, String surname, String birthDate, String userName, String password) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.userName = userName;
		this.password = password;
	}

	public User() {
	}
	
	

}
