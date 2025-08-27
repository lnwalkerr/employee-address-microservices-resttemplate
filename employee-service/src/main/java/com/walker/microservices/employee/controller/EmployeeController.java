package com.walker.microservices.employee.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.walker.microservices.employee.dto.AddressResponse;
import com.walker.microservices.employee.dto.EmployeeResponse;
import com.walker.microservices.employee.service.EmployeeService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    
    private final RestTemplate restTemplate;
    private final EmployeeService employeeService; 
    
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeResponse> getEmployeeById(@PathVariable("id") Long id) {
        EmployeeResponse employeeResponse = employeeService.getEmployeeById(id);

        if (employeeResponse == null) {
            return ResponseEntity.notFound().build();
        }

 
        AddressResponse addressResponse = restTemplate.getForObject(
                "http://localhost:8082/addresses/{employeeId}",
                AddressResponse.class,
                id
        );

       
        employeeResponse.setAddress(addressResponse);

        return ResponseEntity.ok(employeeResponse);
    }
}
