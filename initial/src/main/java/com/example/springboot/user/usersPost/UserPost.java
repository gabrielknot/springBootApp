package com.example.springboot.user.usersPost;
import java.util.Date;

public class UserPost {
	private Date postDate;
	private String postTitle;
	private String postMessage;
	private String postAuthorId;
	private String postAuthorName;
	

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostMessage(String postMessage) {
		this.postMessage = postMessage;
	}

	public String getPostMessage() {
		return postMessage;
	}

	public void setPostAuthorId(String postAuthorId) {
		this.postAuthorId = postAuthorId;
	}

	public String getPostAuthorId() {
		return postAuthorId;
	}

	public void setPostAuthorName(String postAuthorName) {
		this.postAuthorName = postAuthorName;
	}

	public String getPostAuthorName() {
		return postAuthorName;
	}

}

