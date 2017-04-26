package com.chy.swagger.entity;

public class User {
	
	private String id;
	
	private String name;
	
	private String password;
	
	private int no;
	
	private boolean enable;
	
	public User() {}

	public User(String id, String name, String password, int no, boolean enable) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.no = no;
		this.enable = enable;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

}
