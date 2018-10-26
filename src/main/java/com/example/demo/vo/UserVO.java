package com.example.demo.vo;

public class UserVO {
	
	private Integer id;
	private String name;
	private String mobile;

	public UserVO() {
		super();
	}
	public UserVO(Integer id,String name, String mobile) {
		super();
		this.setId(id);
		this.name = name;
		this.mobile = mobile;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
