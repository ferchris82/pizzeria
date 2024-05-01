package chrisferdev.pizzeria.persistence.repository;

import org.springframework.data.repository.ListCrudRepository;

import chrisferdev.pizzeria.persistence.entity.OrderEntity;

import java.time.LocalDateTime;
import java.util.List;


public interface OrderRepository extends ListCrudRepository<OrderEntity, Integer>{
    List<OrderEntity> findAllByDateAfter(LocalDateTime Date);
    List<OrderEntity> findAllByMethodIn(List<String> methods);
}


