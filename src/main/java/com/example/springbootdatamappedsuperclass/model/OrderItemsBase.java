package com.example.springbootdatamappedsuperclass.model;

import jakarta.persistence.*;


@MappedSuperclass
public class OrderItemsBase {

    protected Integer items_number;

    @EmbeddedId
    OrderItemsPK id;

    @ManyToOne
    @MapsId("itemId")
    @JoinColumn(name = "item_id")
    protected Items items;


    public Items getItems() {
        return items;
    }

    public void setItems(Items itemsByItemId) {
        this.items = itemsByItemId;
    }

    public Integer getItems_number() {
        return items_number;
    }

    public void setItems_number(Integer amount) {
        this.items_number = amount;
    }
}
