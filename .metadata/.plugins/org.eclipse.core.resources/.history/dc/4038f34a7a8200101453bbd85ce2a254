package com.walker.microservices.employee.service;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.walker.microservices.employee.dto.EmployeeResponse;
import com.walker.microservices.employee.model.Employee;
import com.walker.microservices.employee.repository.EmployeeRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {
	ModelMapper mapper;
	EmployeeRepository employeeRepository;

	public EmployeeResponse getEmployeeById(Long id) {
		  Employee employee = employeeRepository.findById(id).get();
		  EmployeeResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);
		return employeeResponse;
	}

	

}
