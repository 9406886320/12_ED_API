package com.primesoft.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primesoft.entity.EligDtlsEntity;

public interface EligDtlsRepository extends JpaRepository<EligDtlsEntity, Serializable> {

}
