package com.primesoft.service;

import com.primesoft.response.EligResponse;

public interface EligService {
	
	public EligResponse determineEligibility(Long caseNum);

}
