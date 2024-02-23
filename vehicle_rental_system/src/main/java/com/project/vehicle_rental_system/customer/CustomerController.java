package com.project.vehicle_rental_system.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("home")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("login/customer")
    public String loginCustomer(@RequestBody CustomerDto customer) throws CustomerException {
        return customerService.loginCustomer(customer.getCustomerId(),customer.getCustomerName(),customer.getCustomerPassword());
    }

    @PostMapping("register/customer")
    public String registerCustomer(@RequestBody CustomerDto customer) throws CustomerException {
        return customerService.registerCustomer(customer);
    }
}
