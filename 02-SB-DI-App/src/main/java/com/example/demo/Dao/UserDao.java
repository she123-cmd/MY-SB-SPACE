package com.example.demo.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	
	public UserDao() {
	System.out.println("Constructor::UserDao");
	}

	public String findname(int id)
	{
		if(id==100)
		{
			return "Shekhar";
		}
		else
		{
			return "molaj";
		}
	}

}
