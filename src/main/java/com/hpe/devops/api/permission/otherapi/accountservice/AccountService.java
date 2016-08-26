package com.hpe.devops.api.permission.otherapi.accountservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("account-service")
public interface AccountService {

	
	@RequestMapping(value = "/accounts/{id}", method = RequestMethod.GET)
	public Account getAccountById(@PathVariable("id") String id);
}
