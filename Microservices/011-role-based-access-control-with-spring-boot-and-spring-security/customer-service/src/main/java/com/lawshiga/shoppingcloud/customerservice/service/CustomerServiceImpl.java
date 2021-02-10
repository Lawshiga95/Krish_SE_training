package com.lawshiga.shoppingcloud.customerservice.service;

import com.lawshiga.shoppingcloud.common.model.Customer;
import com.lawshiga.shoppingcloud.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer fetchById(int customerId) {
        Optional<Customer> customer = customerRepository.findById(customerId);
        if(customer.isPresent()) {
            return customer.get();
        } else {
            return null;
        }
    }

    @Override
    public List<Customer> fetchAll(){
        return customerRepository.findAll();
    }
}
