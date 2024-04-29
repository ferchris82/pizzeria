package chrisferdev.pizzeria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chrisferdev.pizzeria.persistence.entity.OrderEntity;
import chrisferdev.pizzeria.persistence.repository.OrderRepository;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public List<OrderEntity> getAll(){
        List<OrderEntity> orders = this.orderRepository.findAll();
        orders.forEach(o -> System.out.println(o.getCustomer().getName()));
        return orders;
    }
}
