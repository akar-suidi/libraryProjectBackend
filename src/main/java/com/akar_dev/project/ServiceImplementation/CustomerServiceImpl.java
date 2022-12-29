package com.akar_dev.project.ServiceImplementation;

import com.akar_dev.project.Entity.UserType.Customer;
import com.akar_dev.project.Repository.CustomerUserRepository;
import com.akar_dev.project.Service.CustomerUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CustomerServiceImpl implements CustomerUserService {
    @Autowired
    CustomerUserRepository customerUserRepository;

    @Override
    public Customer addCustomer(Customer customer) {
        return customerUserRepository.save(customer);
    }

    @Override
    public void delCustomer(Long customerID, Customer customer) {
        customerUserRepository.deleteById(customerID);
    }

    @Override
    public List<Customer> retrieveCustomers() {
        return customerUserRepository.findAll();
    }

    @Override
    public Customer updateCustomers(Long customerID, Customer customer) {
        Customer customerDB = customerUserRepository.findById(customerID).get();
        if (Objects.nonNull(customer.getCustomerName()) &&
                !"".equalsIgnoreCase(customer.getCustomerName())) {
            customerDB.setCustomerName(customer.getCustomerName());
        }
        if (Objects.nonNull(customer.getCustomerEmail()) &&
                !"".equalsIgnoreCase(customer.getCustomerEmail())) {
            customerDB.setCustomerEmail(customer.getCustomerName());
        }
        if (Objects.nonNull(customer.getCustomerPassword()) &&
                !"".equalsIgnoreCase(customer.getCustomerPassword())) {
            customerDB.setCustomerPassword(customer.getCustomerPassword());
        }
        return customerUserRepository.save(customerDB);
    }
}
