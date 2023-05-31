package com.rest.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.entity.Course;
@Service
public class CourseSer implements CourseServices {
	
	List<Course> list;
	
	
	
	public CourseSer() {
		list=new ArrayList<>();
		Course st=new Course(122342, "Java" , "Master in lang");
		Course s=new Course(5454353, "maven" , "Master in maven folders");
		list.add(st);
		list.add(s);
	}
	


	@Override
	public List<Course> getCourses() {
		
		return list;
	}

}
