package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.UserDao;

@Service
public class UserService {
	
	private UserDao userdao;
	
	
		public UserService() {
		System.out.println("no param");
	}


@Autowired
	public UserService(UserDao userdao) {
	
		this.userdao = userdao;
		System.out.println("param Service constructor");
	}

	
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
		System.out.println("Setter injection");
	}
	
	public void getName(int id)
	{
		String findname=userdao.findname(100);
		System.out.println("name "+ findname);
	}
	
	

}
