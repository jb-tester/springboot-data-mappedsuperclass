package com.example.springbootdatamappedsuperclass.model;

import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "customers", schema = "shop")
public class Customer {
    @Id
    @Column(name = "customer_id")
    private Integer customerId;
    
    @OneToMany(mappedBy = "customers")
    private List<Orders> orders;
    
    @Basic
    @Column(name = "customer_name")
    private String customerName;
    
    @Basic
    @Column(name = "address")
    private String address;
    
    @Basic
    @Column(name = "vip")
    private Boolean vip;

    
    public Integer getCustomerId() {
        return customerId;
    }
    
    public List<Orders> getOrders() {
        return orders;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public void setOrders(List<Orders> ordersByCustomerId) {
        this.orders = ordersByCustomerId;
    }

    @Override
    public String toString() {
        return
                "customerId=" + customerId +
                        ", customerName='" + customerName +
                        "', address='" + address  +
                        "', vip=" + vip +
                        ", orders=" + orders +
                        ' ';
    }
}
