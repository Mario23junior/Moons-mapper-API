package com.api.moons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.moons.model.Moons;

@Repository
public interface MoonsRepository extends JpaRepository<Moons, Long>{

	Moons findByName(String name);
}
