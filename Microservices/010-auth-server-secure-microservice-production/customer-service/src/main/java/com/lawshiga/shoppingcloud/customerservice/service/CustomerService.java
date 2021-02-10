package com.lawshiga.shoppingcloud.customerservice.service;

import com.lawshiga.shoppingcloud.common.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Customer save(Customer customer);

    Customer fetchById(int customerId);

    List<Customer> fetchAll();
}
