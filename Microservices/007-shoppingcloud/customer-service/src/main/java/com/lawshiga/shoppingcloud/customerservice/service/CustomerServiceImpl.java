package com.lawshiga.shoppingcloud.customerservice.service;

import com.lawshiga.shoppingcloud.common.model.Customer;
import com.lawshiga.shoppingcloud.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}
