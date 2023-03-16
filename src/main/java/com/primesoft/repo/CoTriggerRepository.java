package com.primesoft.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primesoft.entity.CoTriggerEntity;

public interface CoTriggerRepository  extends JpaRepository<CoTriggerEntity, Serializable>{

}
