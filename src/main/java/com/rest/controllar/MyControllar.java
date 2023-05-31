package com.rest.controllar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Course;
import com.rest.services.CourseServices;

@RestController
public class MyControllar {
	@Autowired
	private CourseServices courseServices;
	
	@GetMapping("/home")
	private String home() {
		return "this is home";
	}
	@GetMapping("/course")
	private List<Course> getCourses(){
		return courseServices.getCourses(); 
	}
	

}
