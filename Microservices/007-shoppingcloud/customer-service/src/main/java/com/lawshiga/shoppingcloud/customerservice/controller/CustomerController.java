package com.lawshiga.shoppingcloud.customerservice.controller;

import com.lawshiga.shoppingcloud.common.model.Customer;
import com.lawshiga.shoppingcloud.customerservice.controller.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/services")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }
}
