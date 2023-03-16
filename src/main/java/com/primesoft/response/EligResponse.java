package com.primesoft.response;

import java.time.LocalDate;

import lombok.Data;

@Data
public class EligResponse {
	
	
	
	private String planName;
	private String planStatus;
	private LocalDate planStartDate;
	private LocalDate planEnddate;
	private Double benefitAmt;
	private String denialReason;

}
