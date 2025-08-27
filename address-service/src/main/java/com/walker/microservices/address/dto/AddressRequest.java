package com.walker.microservices.address.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressRequest {

    @NotBlank(message = "Lane1 is mandatory")
    private String lane1;

    private String lane2;

    @NotBlank(message = "State is mandatory")
    private String state;

    @NotNull(message = "EmployeeId is mandatory")
    private Long employeeId;
}
