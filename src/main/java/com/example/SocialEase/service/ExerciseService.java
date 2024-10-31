package com.example.SocialEase.service; 

import com.example.SocialEase.model.Exercise; 
import com.example.SocialEase.repository.ExerciseRepository; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 

import java.util.List; 

@Service 
public class ExerciseService { 
	@Autowired private ExerciseRepository exerciseRepository; 
	public List<Exercise> findAllExercises() { 
		return exerciseRepository.findAll(); 
		} 
	public Exercise findById(Long id) { 
		return exerciseRepository.findById(id).orElse(null); 
		} 
	}
