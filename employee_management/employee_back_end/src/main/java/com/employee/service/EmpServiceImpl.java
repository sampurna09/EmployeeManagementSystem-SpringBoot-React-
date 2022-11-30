package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Emp;
import com.employee.repository.EmpRepository;


@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpRepository empRepository;

	@Override
	public Emp createEmp(Emp emp) {
		return empRepository.save(emp);
	}

	@Override
	public List<Emp> getAllEmp() {
		return empRepository.findAll();
	}

	@Override
	public Emp getEmpById(int id) {
		return empRepository.findById(id).get();
	}

	@Override
	public void deleteEmp(int id) {
		Emp emp = empRepository.findById(id).get();
		if(emp!=null) {
			empRepository.delete(emp);
		}
		
	}

	@Override
	public Emp updateEmp(int id, Emp emp) {
		Emp oldEmp= empRepository.findById(id).get();
		if(oldEmp!=null) {
		emp.setId(id);
		return empRepository.save(emp);
		}
		return null;
	}

}
