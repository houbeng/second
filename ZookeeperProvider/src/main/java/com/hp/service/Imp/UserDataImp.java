package com.hp.service.Imp;

import com.hp.entity.User;
import com.hp.service.UserData;

public class UserDataImp implements UserData{

	@Override
	public User getUser(Integer id) {
		User user = new User();
		user.setAge(26);
		user.setId(id);
		user.setName("hp");
		return user;
	}

}
