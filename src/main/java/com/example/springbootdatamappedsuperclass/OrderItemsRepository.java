package com.example.springbootdatamappedsuperclass;


import com.example.springbootdatamappedsuperclass.model.OrderItems;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderItemsRepository extends CrudRepository<OrderItems, Integer> {

    @Query("select o from OrderItems o where o.items.price > 10")
    List<OrderItems> showWithExpensiveItems();
}
