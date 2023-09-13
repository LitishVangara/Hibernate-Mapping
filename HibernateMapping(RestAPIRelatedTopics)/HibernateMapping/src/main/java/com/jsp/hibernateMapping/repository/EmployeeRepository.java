package com.jsp.hibernateMapping.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jsp.hibernateMapping.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	@Query("SELECT e1 FROM Employee e1 "
			+ "WHERE e1.eid = :id")
	Optional<Employee> findByEmployeeId(@Param("id") int id);
}
