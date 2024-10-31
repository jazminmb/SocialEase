package com.example.SocialEase.repository; 

import com.example.SocialEase.model.User; 
import org.springframework.data.jpa.repository.JpaRepository; 

public interface UserRepository extends JpaRepository<User, Long> { 
	User findByUsername(String username); 
}