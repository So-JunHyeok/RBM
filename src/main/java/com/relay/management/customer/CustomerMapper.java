package com.relay.management.customer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
public interface CustomerMapper {

 List<CustomerDTO> findByCustomerList(CustomerDTO customerDTO) throws Exception;
 int findByCustomerCount(CustomerDTO customerDTO) throws Exception;
 int insertInCustomer(CustomerDTO customerDTO) throws Exception;
 int deleteInCustomer(CustomerDTO customerDTO) throws Exception;
}
