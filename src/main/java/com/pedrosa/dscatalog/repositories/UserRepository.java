package com.pedrosa.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrosa.dscatalog.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
