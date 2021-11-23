package io.getarryas.userserviece.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.getarryas.userserviece.domain.Role;
import io.getarryas.userserviece.domain.User;
import io.getarryas.userserviece.repo.RoleRepo;
import io.getarryas.userserviece.repo.UserRepo;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	@Autowired
	private RoleRepo roleRepo;

	
	@Override
	public User saveUser(User user) {
		// TODO 自動生成されたメソッド・スタブ
		log.info("Saving new user to the database");
		return userRepo.save(user);
	}

	@Override
	public Role saveRole(Role role) {
		// TODO 自動生成されたメソッド・スタブ
		log.info("Saving new role {} to the database",role.getName());
		return roleRepo.save(role);
	}

	@Override
	public void addRoleToUser(String username, String roleName) {
		// TODO 自動生成されたメソッド・スタブ
		log.info("Adding role {} to user {}", roleName, username);
		User user = userRepo.findByUsername(username);
		Role role = roleRepo.findByName(roleName);
		user.getRoles().add(role);
	}

	@Override
	public User getUser(String username) {
		// TODO 自動生成されたメソッド・スタブ
		log.info("Fetching user {}", username);
		return userRepo.findByUsername(username);
	}

	@Override
	public List<User> getUsers() {
		// TODO 自動生成されたメソッド・スタブ
		log.info("Fetching all users");
		return userRepo.findAll();
	}
	


}
