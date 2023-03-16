package com.primesoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.primesoft.response.EligResponse;
import com.primesoft.service.EligService;

@RestController
public class EDRestController {
	
	@Autowired
	private EligService service;
	
	
	@GetMapping("/eligibillity/{caseNum}")
	public EligResponse determineEligibility(@PathVariable Long caseNum) {
		
		EligResponse eligResponse = service.determineEligibility(caseNum);
		return eligResponse;
	}

	
	
}
