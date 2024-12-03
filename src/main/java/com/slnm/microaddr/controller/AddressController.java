package com.slnm.microaddr.controller;

import com.slnm.microaddr.service.AddressService;
import com.slnm.microaddr.view.AddressView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("/address/{empId}")
    public ResponseEntity<AddressView> getEmployeeByEmployeeId(@PathVariable Integer empId){
        AddressView addressView = addressService.getAddressByempId(empId);
        return ResponseEntity.status(HttpStatus.OK).body(addressView);
    }
}
