package com.lawshiga.shoppingcloud.customerservice.controller;

import com.lawshiga.shoppingcloud.common.model.Customer;
import com.lawshiga.shoppingcloud.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    @PreAuthorize("hasAuthority('create_customer')")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public Customer fetch(@RequestParam int customerId) {
        return customerService.fetchById(customerId);
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_operator')")
    public List<Customer> fetchAll() {
        return customerService.fetchAll();
    }
}
