package com.hpe.devops.api.permission.otherapi.roleservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("role-service")
public interface RoleService {

	@RequestMapping(value = "/roles/{id}", method = RequestMethod.GET)
	public Role getRoleById(@PathVariable("id") String id);

}
