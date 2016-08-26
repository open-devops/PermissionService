package com.hpe.devops.api.permission.otherapi.organizationservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("organization-service")
public interface OrganizationService {
	
	@RequestMapping(value = "/organizations/{id}", method = RequestMethod.GET)
	public Organization getOrganizationById(@PathVariable("id") String id);

}
