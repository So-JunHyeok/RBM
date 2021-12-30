package com.relay.management.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<CustomerDTO> findByCustomerList(CustomerDTO customerDTO) throws Exception {
        return customerMapper.findByCustomerList(customerDTO);
    }

    @Override
    public int findByCustomerCount(CustomerDTO customerDTO) throws Exception {
        return customerMapper.findByCustomerCount(customerDTO);
    }

    @Override
    public int insertInCustomer(CustomerDTO customerDTO) throws Exception {
        return customerMapper.insertInCustomer(customerDTO);
    }

    @Override
    public int deleteInCustomer(CustomerDTO customerDTO) throws Exception {
        return customerMapper.deleteInCustomer(customerDTO);

    }
}
