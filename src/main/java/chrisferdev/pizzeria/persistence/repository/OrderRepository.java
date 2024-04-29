package chrisferdev.pizzeria.persistence.repository;

import org.springframework.data.repository.ListCrudRepository;

import chrisferdev.pizzeria.persistence.entity.OrderEntity;

public interface OrderRepository extends ListCrudRepository<OrderEntity, Integer>{

}
