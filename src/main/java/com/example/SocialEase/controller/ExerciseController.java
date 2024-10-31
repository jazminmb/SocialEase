package com.example.SocialEase.controller; 

import com.example.SocialEase.model.Exercise; 
import com.example.SocialEase.service.ExerciseService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.*; 
import java.util.List; 

@RestController 
@RequestMapping("/api/exercises") 
public class ExerciseController { 
	@Autowired 
	private ExerciseService exerciseService; 
	@GetMapping 
	public List<Exercise> getAllExercises() { 
		return exerciseService.findAllExercises(); 
		} 
	@GetMapping("/{id}") 
	public ResponseEntity<Exercise> getExerciseById(@PathVariable Long id) { 
		Exercise exercise = exerciseService.findById(id); 
		return ResponseEntity.ok(exercise); 
		} 
	}
