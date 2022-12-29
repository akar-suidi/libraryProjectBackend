package com.akar_dev.project.Service;

import com.akar_dev.project.Entity.UserType.Customer;

import java.util.List;

public interface CustomerUserService {

    Customer addCustomer(Customer customer);
    void delCustomer(Long customerID , Customer customer);
    List<Customer> retrieveCustomers();

    Customer updateCustomers(Long customerID , Customer customer);
}
