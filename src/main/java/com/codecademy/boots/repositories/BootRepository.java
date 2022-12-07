package com.codecademy.boots.repositories;

import com.codecademy.boots.entities.Boot;
import org.springframework.data.repository.CrudRepository;

public interface BootRepository extends CrudRepository<Boot,Integer> {
}
