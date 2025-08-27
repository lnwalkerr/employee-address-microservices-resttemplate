package com.walker.microservices.address.controller;

import com.walker.microservices.address.dto.AddressResponse;
import com.walker.microservices.address.service.AddressServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/addresses")
public class AddressController {

    private final AddressServiceImpl addressServiceImpl;

    @GetMapping("/{id}")
    public ResponseEntity<AddressResponse> getAddressById(@PathVariable Long id) {
        AddressResponse addressResponse = addressServiceImpl.getAddressById(id);

        if (addressResponse == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(addressResponse);
        }
    }
}
