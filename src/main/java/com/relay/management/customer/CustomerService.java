package com.relay.management.customer;

import java.util.List;

public interface CustomerService {
    List<CustomerDTO> findByCustomerList(CustomerDTO customerDTO) throws Exception;
    int findByCustomerCount(CustomerDTO customerDTO) throws Exception;
    int insertInCustomer(CustomerDTO customerDTO) throws Exception;
    int deleteInCustomer(CustomerDTO customerDTO) throws Exception;
}
