package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */

 @SpringBootApplication
 @RestController
 @RequestMapping("/orders")

public class App 
{
    @Autowired
    private OrderDao orderDao;

    @GetMapping("/getOrders")
    public List<Order> getOrders(){
        return orderDao.getOrders();
    }

    public static void main( String[] args )
    {
        SpringApplication.run( App.class, args);
    }
}
