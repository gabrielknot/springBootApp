package com.example.springboot.hello;


public class HelloBean {
	private String message;
	
	public HelloBean(String message) {
		this.message = message;
	}
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public String getMessage(){
		return message;
	}

	@Override
	public String toString() {
		return String.format("Hello [message=%s]",message);
	}

}
