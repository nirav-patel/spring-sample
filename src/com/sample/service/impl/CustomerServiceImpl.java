package com.sample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sample.common.IManager;
import com.sample.repository.ICustomerRepository;
import com.sample.service.ICustomerService;

@Component
public class CustomerServiceImpl implements ICustomerService {

  @Autowired
  private ICustomerRepository customerRepository;
  
  @Autowired 
  @Qualifier("QA")
  IManager manager;

  public CustomerServiceImpl() {}

  
  public CustomerServiceImpl(ICustomerRepository customerRepository) {
    System.out.println("Using constructor injection");
    this.customerRepository = customerRepository;
  }

  public void setCustomerRepository(ICustomerRepository customerRepository) {
    System.out.println("Using setter injection");
    this.customerRepository = customerRepository;
  }

  @Override
  public void displayInfo() {
    System.out.println("Customers ["+ customerRepository.getAllCustomers()+"] are managed by "+manager.getManagerInfo());
  }
  
}
