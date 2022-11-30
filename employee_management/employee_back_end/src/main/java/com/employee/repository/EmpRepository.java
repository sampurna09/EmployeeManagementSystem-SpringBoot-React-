package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.model.Emp;

public interface EmpRepository extends JpaRepository<Emp, Integer>{

}
