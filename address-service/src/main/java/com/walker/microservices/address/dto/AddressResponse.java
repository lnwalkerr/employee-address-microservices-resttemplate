package com.walker.microservices.address.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressResponse {

    private Long id;
    private String lane1;
    private String lane2;
    private String state;
    private Long employeeId;
}
