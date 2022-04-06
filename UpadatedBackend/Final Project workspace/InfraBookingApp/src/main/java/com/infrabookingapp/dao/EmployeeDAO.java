package com.infrabookingapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infrabookingapp.entity.Employee;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {
	Employee findByEmail(String email);
}
