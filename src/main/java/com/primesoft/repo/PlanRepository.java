package com.primesoft.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primesoft.entity.PlanEntity;

public interface PlanRepository extends JpaRepository<PlanEntity, Serializable>{

	
	
}
