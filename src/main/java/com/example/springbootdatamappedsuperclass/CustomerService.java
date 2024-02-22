package com.example.springbootdatamappedsuperclass;

import com.example.springbootdatamappedsuperclass.model.Customer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional()
    public void displayAll(){
        for (Customer customer : customerRepository.findAll()) {
            System.out.println(customer);
        }
    }
    @Transactional()
    public void displayUrgent(){
        for (Customer customer : customerRepository.findByUrgentOrders()) {
            System.out.println(customer);
        }
    }
}
