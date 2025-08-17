package com.nt.entity;

public class Employee {

	private Integer id;

	private String name;

	private String emailId;

	private String phno;

	public Employee(Integer id, String name, String emailId, String phno) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.phno = phno;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", emailId=" + emailId + ", phno=" + phno + "]";
	}

}
