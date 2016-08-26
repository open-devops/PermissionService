package com.hpe.devops.api.permission;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hpe.devops.api.permission.otherapi.accountservice.AccountService;
import com.hpe.devops.api.permission.otherapi.organizationservice.OrganizationService;
import com.hpe.devops.api.permission.otherapi.productservice.Product;
import com.hpe.devops.api.permission.otherapi.productservice.ProductService;
import com.hpe.devops.api.permission.otherapi.roleservice.RoleService;

@RestController
@CrossOrigin
@RequestMapping(value = "/permissions", produces = { "application/json" })
public class PermissionController {

	
	@Autowired
	private PermisstionRepository permissionRepo;
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private OrganizationService organizationService;
	
	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/pipeline/{pipelineId}", method = RequestMethod.GET)
	public List<PermissionRes> getPipelinetPermissions(String pipelineId){
		
		List<Permission> permissionList = permissionRepo.findByPipelineId(pipelineId);
		
		List<PermissionRes> permissionResList = new ArrayList<PermissionRes>();
		
		for(Permission permission : permissionList){
			
			PermissionRes permissionRes = createPermissionRes(permission);
			
			permissionResList.add(permissionRes);
		}
		
		return permissionResList;
	}
		
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public PermissionRes getPermissionById(String id){
		
		Permission permission = permissionRepo.findOne(id);
		
		PermissionRes permissionRes = createPermissionRes(permission);
		
		return permissionRes;
	}
		
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<PermissionRes> addPermission(@RequestBody Permission permission) throws Exception {
	
		permission.setId(UUID.randomUUID().toString());
		
		permission = permissionRepo.save(permission);
		
		PermissionRes permissionRes = createPermissionRes(permission);
		
		return new ResponseEntity<PermissionRes>(permissionRes, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public ResponseEntity<PermissionRes> updatePermission(@RequestBody Permission permission) throws Exception {
		
		permission = permissionRepo.save(permission);
		
		PermissionRes permissionRes = createPermissionRes(permission);
		
		return new ResponseEntity<PermissionRes>(permissionRes, HttpStatus.OK);
	}


	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteRole(@PathVariable String id) throws Exception {

		permissionRepo.delete(id);
		
		return new ResponseEntity<String>("Deleted", HttpStatus.OK);
	}
	
	private PermissionRes createPermissionRes(Permission permission) {
		
		PermissionRes permissionRes = PermissionRes.getPermissionRes(permission);
	
		permissionRes.setRoleName(roleService.getRoleById(permission.getRoleId()).getName());
		
		permissionRes.setAccountName(accountService.getAccountById(permission.getAccountId()).getName());
		
		permissionRes.setOrganizationName(organizationService.getOrganizationById(permission.getOrganizationId()).getName());
		
		Product product = productService.getProductById(permission.getPipelineId());
		
		permissionRes.setPipelineName(product.getPipelineName());
		
		permissionRes.setProductName(product.getName());
		
		//permissionRes.setRoleName(roleService.getRoleById(permission.getRoleId()).getName());
		
		return permissionRes;
	}
}
