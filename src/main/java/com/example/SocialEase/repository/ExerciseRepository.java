package com.example.SocialEase.repository; 

import com.example.SocialEase.model.Exercise; 
import org.springframework.data.jpa.repository.JpaRepository; 

public interface ExerciseRepository extends JpaRepository<Exercise, Long> { 
	
}
