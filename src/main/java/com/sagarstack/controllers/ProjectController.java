package com.sagarstack.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sagarstack.dtos.CourseResponseDTO;


@RestController
@RequestMapping("api/projects")
public class ProjectController {

	
	
	@GetMapping("/")
	public List<CourseResponseDTO> getCourses(){
		List<CourseResponseDTO> courses = new ArrayList<>();
		courses.add(new CourseResponseDTO("DOTNET","9 months"));
		courses.add(new CourseResponseDTO("JAVA","9 months"));	
		return courses;
	}
	
}
