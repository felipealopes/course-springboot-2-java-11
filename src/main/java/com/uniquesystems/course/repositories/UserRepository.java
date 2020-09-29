package com.uniquesystems.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uniquesystems.course.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
