package com.example.springbootdatamappedsuperclass.model;

import jakarta.persistence.*;


@Entity
@Table(name = "order_items", schema = "shop")
@AttributeOverride(name = "items_number", column = @Column(name = "amount"))
public class OrderItems extends OrderItemsBase{

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    private Orders orders;


    @Override
    public String toString() {
        return "OrderItems{" +
                "id=" + id +
                ", items=" + getItems() +
                ", amount=" + getItems_number() +
                '}';
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders ordersByOrderId) {
        this.orders = ordersByOrderId;
    }
}
