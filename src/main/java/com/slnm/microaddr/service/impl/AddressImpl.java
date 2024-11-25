package com.slnm.microaddr.service.impl;

import com.slnm.microaddr.entity.Address;
import com.slnm.microaddr.repository.AddressRepo;
import com.slnm.microaddr.service.AddressService;
import com.slnm.microaddr.view.AddressView;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressImpl implements AddressService {

    @Autowired
    AddressRepo repo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public AddressView getAddressByempId(Integer id) {
    	System.out.println(id+" getAddressByempId ::::");
        Address adderss = repo.findAddressByEmployeeId(id);
        return modelMapper.map(adderss, AddressView.class);
    }
}
