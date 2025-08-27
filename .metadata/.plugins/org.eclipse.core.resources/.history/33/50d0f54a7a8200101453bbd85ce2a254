package com.walker.microservices.employee.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequest {

    @NotBlank(message = "Employee name is mandatory")
    private String employeeName;

    private String bloodGroup;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    private String email;
    
}