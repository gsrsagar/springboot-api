package com.sagarstack.dtos;

public class CourseResponseDTO {

	
	public String courseName;
	public String duration;
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public CourseResponseDTO() {
	}
	
	public CourseResponseDTO(String courseName, String duration) {
		this.courseName = courseName;
		this.duration = duration;
	}
	
	
	
}
