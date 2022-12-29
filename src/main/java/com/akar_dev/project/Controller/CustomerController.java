package com.akar_dev.project.Controller;

import com.akar_dev.project.Entity.UserType.Customer;
import com.akar_dev.project.ServiceImplementation.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerServiceImpl customerServiceImpl;

    @GetMapping("/customers")
    private List<Customer> retrieveCustomers() {
        return customerServiceImpl.retrieveCustomers();
    }

    @PostMapping("/addCustomer")
    private Customer addCustomer(@RequestBody Customer customer) {
        return customerServiceImpl.addCustomer(customer);
    }

    @DeleteMapping("/delCustomer/{id}")
    private String deleteCustomers(@PathVariable("id") Long customerID, @RequestBody Customer customer) {
        customerServiceImpl.delCustomer(customerID, customer);
        return "Customer Deleted Successfully!!!";
    }
}
