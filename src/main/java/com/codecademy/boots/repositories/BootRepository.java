package com.codecademy.boots.repositories;

import com.codecademy.boots.entities.Boot;
import com.codecademy.boots.enums.BootType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BootRepository extends CrudRepository<Boot,Integer> {
    List<Boot> findBySize(Integer size);

    List<Boot> findByMaterial(String material);

    List<Boot> findByType(BootType type);

    List<Boot> findByQuantityGreaterThan(Integer Quantity);
}
