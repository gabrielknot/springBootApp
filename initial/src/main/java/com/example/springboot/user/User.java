package com.example.springboot.user;
import java.util.Date;

public class User {
	private Integer id;
	private String name;
	private Date birthDate;

	public User(Integer id, String name, Date birthDate) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	  
	/**
	 * Get id.
	 *
	 * @return id as Integer.
	 */
	public Integer getId() {
	    return id;
	}

	/**
	 * Set id.
	 *
	 * @param id the value to set.
	 */
	public void setId(Integer id) {
	    this.id = id;
	}

	/**
	 * Get name.
	 *
	 * @return name as String.
	 */
	public String getName() {
	    return name;
	}

	/**
	 * Set name.
	 *
	 * @param name the value to set.
	 */
	public void setName(String name) {
	    this.name = name;
	}

	/**
	 * Get birthDate.
	 *
	 * @return birthDate as Date.
	 */
	public Date getBirthDate() {
	    return birthDate;
	}

	/**
	 * Set birthDate.
	 *
	 * @param birthDate the value to set.
	 */
	public void setBirthDate(Date birthDate) {
	    this.birthDate = birthDate;
	}



	@Override
	public String toString() {
		return "User{" +
			"id = " + getId() +
			", name = " + getName() +
			", birthDate = " + getBirthDate() +
			"}";
	}


}
