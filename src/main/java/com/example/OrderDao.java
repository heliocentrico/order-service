package com.example;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {
    
    public List<Order> getOrders(){

        return Stream.of(
            new Order(1, new Date(), 1, 36.5),
            new Order(2, new Date(), 3, 325.5),
            new Order(3, new Date(), 5, 1325.2)
        ).collect(Collectors.toList());
    }
}
