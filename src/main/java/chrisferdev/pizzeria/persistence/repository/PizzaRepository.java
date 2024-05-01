package chrisferdev.pizzeria.persistence.repository;

import java.util.List;

import org.springframework.data.repository.ListCrudRepository;

import chrisferdev.pizzeria.persistence.entity.PizzaEntity;

public interface PizzaRepository extends ListCrudRepository<PizzaEntity, Integer>{
    List<PizzaEntity> findAllByAvailableTrueOrderByPrice();
    PizzaEntity findAllByAvailableTrueAndNameIgnoreCase(String name);
<<<<<<< HEAD
    List<PizzaEntity> findAllByAvailableTrueAndDescriptionContainingIgnoreCase(String description);
=======
>>>>>>> 2faae9e6932e11e4f5ad7c50321d5465563538fc
}
