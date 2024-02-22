package com.example.springbootdatamappedsuperclass;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDataMappedsuperclassApplication implements CommandLineRunner {


    private final CustomerService customerService;
    private final OrderItemsService orderItemsService;

    public SpringbootDataMappedsuperclassApplication(CustomerService customerService, OrderItemsService orderItemsService) {
        this.customerService = customerService;
        this.orderItemsService = orderItemsService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDataMappedsuperclassApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        customerService.displayAll();
        System.out.println("=======================================");
        customerService.displayUrgent();
        System.out.println("=======================================");
        orderItemsService.displayAll();
        System.out.println("=======================================");
        orderItemsService.displayExpensive();
    }
}
