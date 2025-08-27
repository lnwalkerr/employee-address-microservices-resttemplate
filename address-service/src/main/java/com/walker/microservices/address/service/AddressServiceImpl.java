package com.walker.microservices.address.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.walker.microservices.address.dto.AddressRequest;
import com.walker.microservices.address.dto.AddressResponse;
import com.walker.microservices.address.model.Address;
import com.walker.microservices.address.repository.AddressRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class AddressServiceImpl implements AddressService {

    private final ModelMapper mapper;
    private final AddressRepository addressRepository;

    @Override
    public AddressResponse getAddressById(Long id) {
        Address address = addressRepository.findByemployeeId(id)
                .orElse(null);

        return (address != null) ? mapper.map(address, AddressResponse.class) : null;
    }

    @Override
    public AddressResponse saveAddress(AddressRequest addressRequest) {
        Address address = mapper.map(addressRequest, Address.class);
        Address saved = addressRepository.save(address);
        return mapper.map(saved, AddressResponse.class);
    }
}
