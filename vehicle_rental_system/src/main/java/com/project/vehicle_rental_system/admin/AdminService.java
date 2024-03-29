package com.project.vehicle_rental_system.admin;

import com.project.vehicle_rental_system.admin.exceptions.*;
import com.project.vehicle_rental_system.customer.Customer;
import com.project.vehicle_rental_system.customer.CustomerDto;

import java.util.List;
import java.util.Optional;

public interface AdminService {
    Admin loginAdmin(AdminLoginDTO adminLoginDTO) throws AdminException;

    Customer addCustomer(CustomerDto customer) throws AddCustomerException;

    String updateCustomer(CustomerDto customer) throws UpdateCustomerException;

    Customer getCustomerById(Integer customerId) throws GetCustomerException;

    String deleteCustomer(Integer id) throws DeleteCustomerException;

    List<Customer> getAllCustomers();

}
