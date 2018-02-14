package com.jaguergo.model;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Attendee {

	@Length(min = 2, max = 30)
	public String name;

	@NotEmpty
	@Email
	public String emailAddress;

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setName(String name) {
		this.name = name;
	}
}
