package com.sample.service;

import javax.jws.WebService;

import com.sample.generated.Person;

@WebService
public interface SampleWebService {
	 Person getDataFromWebService();
	 String getDataFromWebServiceVipin();
}
