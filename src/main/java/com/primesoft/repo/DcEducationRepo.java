package com.primesoft.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primesoft.entity.DcEducationEntity;

public interface DcEducationRepo extends JpaRepository<DcEducationEntity,Serializable> {

	public DcEducationEntity findByCaseNum(Long caseNum);
}
