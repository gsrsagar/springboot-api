package com.sagarstack.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sagarstack.entities.Employee;

import jakarta.transaction.Transactional;


@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	public Employee findByName(String name); 
	public Employee findByDepartment(String department);
	
	
	@Query("SELECT e FROM Employee e WHERE e.department = :dept")
	 List<Employee> getEmployeesByDepartment(@Param("dept") String dept);
	
	
	@Query("UPDATE Employee e SET e.salary = :salary WHERE e.id = :id")
	int updateSalary(@Param("id") Long id, @Param("salary") double salary);
}
