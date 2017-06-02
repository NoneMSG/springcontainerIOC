package com.jx372.springcontainer;

import java.util.List;

public class User {
	private Friend friend;
	private String name;
	private List<String> friends;
	
	public User(String name){
		this.name = name;
	}

	public final Friend getFriend() {
		return friend;
	}

	public final void setFriend(Friend friend) {
		this.friend = friend;
	}

	

	public final void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "User [friend=" + friend + ", name=" + name + ", friends=" + friends + "]";
	}
	
}
