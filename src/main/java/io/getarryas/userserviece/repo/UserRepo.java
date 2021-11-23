package io.getarryas.userserviece.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.getarryas.userserviece.domain.User;

@Repository
public interface UserRepo extends JpaRepository <User, Long>{
	User findByUsername(String username);

}
