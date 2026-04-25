package com.educandoweb.course.controller;

import com.educandoweb.course.model.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

import static com.educandoweb.course.model.OrderStatus.DELIVERED;

@RestController
@RequestMapping(value = "/order")
public class OrderResouces {

    @GetMapping
    public ResponseEntity<Order> findAll(){
        Order o = new Order(1L, new Date(), DELIVERED);
        return ResponseEntity.ok().body(o);
    }

}
