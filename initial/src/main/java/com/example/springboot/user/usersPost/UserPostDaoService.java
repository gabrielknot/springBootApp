package com.example.springboot.user.usersPost;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Component;

@Component
public class UserPost {

	private static Tree<UserPost> userPosts = new TreeSet();
	private static Integer userPostCount = 4;
	static {
		userPosts.add(new UserPost(1,"Adam", new Date()));
		userPosts.add(new UserPost(2,"Amarildo", new Date()));
		userPosts.add(new UserPost(3,"Karele", new Date()));
		userPosts.add(new UserPost(4,"Jamal", new Date()));
	}


	public static void setUserPosts(Tree<UserPost> userPosts) {
		UserPost.userPosts = userPosts;
	}

	public static Tree<UserPost> getUserPosts() {
		return userPosts;
	}

	public static void setUserPostCount(Integer userPostCount) {
		UserPost.userPostCount = userPostCount;
	}

	public static Integer getUserPostCount() {
		return userPostCount;
	}
	
	public static UserPost findUserPost(int id){
		for(UserPost userPost:userPosts){
			if(userPost.getId()==id){
				return userPost;
			}
		}
		return null;
	}

}
