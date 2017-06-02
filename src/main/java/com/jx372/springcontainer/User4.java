package com.jx372.springcontainer;

public class User4 {
	private Long no;
	private String name;
	private String email;
	
	@Override
	public String toString() {
		return "User4 [no=" + no + ", name=" + name + "]";
	}
	
	public final void setNo(Long no) {
		this.no = no;
	}
	public final void setName(String name) {
		this.name = name;
	}
	
	
}
