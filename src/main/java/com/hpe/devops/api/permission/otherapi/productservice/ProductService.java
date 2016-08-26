package com.hpe.devops.api.permission.otherapi.productservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("product-service")
public interface ProductService {
	
	@RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
	public Product getProductById(@PathVariable("id") String id);
	

}
