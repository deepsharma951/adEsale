package com.org.abde.beans;

import java.io.Serializable;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.org.abde.validator.Phone;

@Entity
@Table(name= "User")
public class User implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 3443831110839030853L;

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;

@Size(min=2, max=30) 
private String username;

@Size(min=8, max=15) 
private String password;

@Size(min=2, max=30) 
private String firstname;

@Size(min=2, max=30) 
private String lastname;

@Phone
private String phone;

@NotEmpty @Email
private String email;

@NotNull 
private Gender gender;

@NotNull @NotEmpty
private String  address;

/*@NotNull @Min(18) @Max(100)
private int age;*/


@NotNull
private String birthday;

public String getBirthday() {
	return birthday;
}
public void setBirthday(String birthday) {
	this.birthday =birthday;
}
public enum Gender {
	MALE, FEMALE
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
/*public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}*/

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
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public Gender getGender() {
	return gender;
}
public void setGender(Gender gender) {
	this.gender = gender;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}


}
