package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lti.dao.UserSpecificDao;
import com.lti.entity.User;
import com.lti.interfaces.UserManagement;

@Component("userMgmt")
public class UserManagementImplementation implements UserManagement {

	@Autowired
	UserSpecificDao userSpecificDao;
	
	public void addUser(User user) {
		userSpecificDao.addNewObject(user);
	}
}
