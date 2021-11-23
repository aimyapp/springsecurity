package io.getarryas.userserviece.service;

import java.util.List;

import io.getarryas.userserviece.domain.Role;
import io.getarryas.userserviece.domain.User;


public interface UserService {

	User saveUser(User user);
	Role saveRole(Role role);
	void addRoleToUser(String username,String roleName);
	User getUser(String username);
	List<User> getUsers();
		
}
