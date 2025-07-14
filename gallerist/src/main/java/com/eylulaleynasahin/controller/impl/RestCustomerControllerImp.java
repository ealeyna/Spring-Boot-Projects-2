package com.eylulaleynasahin.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eylulaleynasahin.controller.IRestCustomerController;
import com.eylulaleynasahin.controller.RestBaseController;
import com.eylulaleynasahin.controller.RootEntity;
import com.eylulaleynasahin.dto.DtoCustomer;
import com.eylulaleynasahin.dto.DtoCustomerIU;
import com.eylulaleynasahin.service.ICustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/api/customer")
public class RestCustomerControllerImp extends RestBaseController implements IRestCustomerController{

	@Autowired
	private ICustomerService customerService;

	@PostMapping("/save")
	@Override
	public RootEntity<DtoCustomer> saveCustomer(@Valid @RequestBody DtoCustomerIU dtoCustomerIU) {
		return ok(customerService.saveCustomer(dtoCustomerIU));
	}
}






