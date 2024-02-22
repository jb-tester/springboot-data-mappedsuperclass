package com.example.springbootdatamappedsuperclass;

import com.example.springbootdatamappedsuperclass.model.OrderItems;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class OrderItemsService {

    private final OrderItemsRepository orderItemsRepository;

    public OrderItemsService(OrderItemsRepository orderItemsRepository) {
        this.orderItemsRepository = orderItemsRepository;
    }
    @Transactional
    public void displayAll() {
        for (OrderItems orderItems : orderItemsRepository.findAll()) {
            System.out.println(orderItems);
        }
    }
    @Transactional
    public void displayExpensive() {
        for (OrderItems orderItems : orderItemsRepository.showWithExpensiveItems()) {
            System.out.println(orderItems);
        }
    }
}
