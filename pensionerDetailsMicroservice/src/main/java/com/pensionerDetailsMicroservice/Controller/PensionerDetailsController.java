package com.pensionerDetailsMicroservice.Controller;

import java.io.IOException;
import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pensionerDetailsMicroservice.Exception.AadharNumberNotFoundException;
import com.pensionerDetailsMicroservice.Model.PensionerDetail;
import com.pensionerDetailsMicroservice.Service.PensionerdetailService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class PensionerDetailsController {

	@Autowired
	private PensionerdetailService pensionerdetailService;
	
	/*
	 * POST:   localhost:8082/pensionerDetailByAadhaar/102233445566
	 * 
	 */

	@PostMapping("/pensionerDetailByAadhaar/{aadhaarNumber}")
	public PensionerDetail getPensionerDetailByAadhaar(@PathVariable long aadhaarNumber ) throws NumberFormatException, IOException, AadharNumberNotFoundException, ParseException  {
		
		log.info("start getPensionerDetailByAadhaar");

			log.debug(""+aadhaarNumber);
			log.info("end getPensionerDetailByAadhaar");
			return pensionerdetailService.getPensionerDetailByAadhaarNumber(aadhaarNumber);
	}
}
