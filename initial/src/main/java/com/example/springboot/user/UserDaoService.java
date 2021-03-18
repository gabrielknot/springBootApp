package com.example.springboot.user;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	private static Integer usersCount = 4;
	static {
		users.add(new User(1,"Adam", new Date()));
		users.add(new User(2,"Amarildo", new Date()));
		users.add(new User(3,"Karele", new Date()));
		users.add(new User(4,"Jamal", new Date()));
	}

	/**
	 * Get users.
	 *
	 * @return users as List<User>.
	 */
	public static List<User> findAllUsers() {
	    return users;
	}
	
	public static User addUser(User user) {
		if(user.getId()==null){
	    		user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}

	public static User findUser(int id){
		for(User user:users){
			if(user.getId()==id){
				return user;
			}
		}
		return null;
	}
}
