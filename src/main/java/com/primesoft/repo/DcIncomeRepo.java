package com.primesoft.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primesoft.entity.DcIncomeEntity;

public interface DcIncomeRepo extends JpaRepository<DcIncomeEntity, Serializable> {

	public DcIncomeEntity findByCaseNum(Long caseNumber) ;
}
