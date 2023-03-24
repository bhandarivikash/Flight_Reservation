package com.Flight.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight.Entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String emailId);

	}
