package com.example.j6demo5.entity;


import jakarta.persistence.*;
import lombok.Data;


import java.math.BigDecimal;

@Data
@Entity
@Table(name = "OrderDetails")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    BigDecimal price;
    Integer quantity;
    @ManyToOne
    @JoinColumn(name = "order")
    Order order;
    @ManyToOne
    @JoinColumn(name = "product")
    Product product;
}
