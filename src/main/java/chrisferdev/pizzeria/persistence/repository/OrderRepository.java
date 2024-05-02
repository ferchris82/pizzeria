package chrisferdev.pizzeria.persistence.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;

import chrisferdev.pizzeria.persistence.entity.OrderEntity;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;


public interface OrderRepository extends ListCrudRepository<OrderEntity, Integer>{
    List<OrderEntity> findAllByDateAfter(LocalDateTime Date);
    List<OrderEntity> findAllByMethodIn(List<String> methods);

    @Query(value = "SELECT * FROM pizza_order WHERE id_customer = :id", nativeQuery = true)
    List<OrderEntity> findCustomerOrders(@Param("id") String idCustomer);
}


