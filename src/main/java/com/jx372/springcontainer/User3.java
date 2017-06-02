package com.jx372.springcontainer;

public class User3 {
	private String name;
	private Long no;
	
	public User3(Long no, String name){
		this.name=name;
		this.no=no;
	}

	@Override
	public String toString() {
		return "User3 [name=" + name + ", no=" + no + "]";
	}
}
