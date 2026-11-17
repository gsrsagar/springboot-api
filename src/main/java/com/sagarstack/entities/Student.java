package com.sagarstack.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 20,nullable = false, unique = true)
	private String name;

	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(
			name = "student_coursessss",
			joinColumns = @JoinColumn(name = "student_iddddd"),
			inverseJoinColumns = @JoinColumn(name = "course_idddd")
	)
	private List<Course> courses;
}

/**   
 *       student :{ -LAZY
 *          "id":1,
 *           "name":"sagar",
 *           "courses": [1,2]   
 *       }
 *       
 *        student :{ -> EAGER
 *          "id":1,
 *           "name":"sagar",
 *           "courses": [
 *           { "courseId":1, "courseName":"JAVA"},
 *            { "courseId":2, "courseName":"DOTNET"},]   
 *           
 *           
 *       }
 *       
 *       
 **/
