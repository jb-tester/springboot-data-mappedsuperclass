package com.example.springbootdatamappedsuperclass;


import com.example.springbootdatamappedsuperclass.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    @Query("select c from Customer c join fetch c.orders o where o.urgent = true")
    List<Customer> findByUrgentOrders();
}
