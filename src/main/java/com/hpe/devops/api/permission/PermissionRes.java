package com.hpe.devops.api.permission;

public class PermissionRes {

    private String id;

    private String organizationId;
    
    private String organizationName;
    
    private String productName;
    
    private String pipelineId;
    
    private String pipelineName;
    
    private String accountId;
    
    private String accountName;
    
    private String roleId;
    
    private String roleName;
    
    public PermissionRes(){
    	
    }

    public static PermissionRes getPermissionRes(Permission permission){
    	PermissionRes permissionRes = new PermissionRes();
    	              
    	permissionRes.setId(permission.getId());
    	permissionRes.setOrganizationId(permission.getOrganizationId());
    	permissionRes.setPipelineId(permission.getPipelineId());
    	permissionRes.setAccountId(permission.getAccountId());
    	permissionRes.setRoleId(permission.getRoleId());
    	
    	return permissionRes;

    }
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getPipelineId() {
		return pipelineId;
	}

	public void setPipelineId(String pipelineId) {
		this.pipelineId = pipelineId;
	}

	public String getPipelineName() {
		return pipelineName;
	}

	public void setPipelineName(String pipelineName) {
		this.pipelineName = pipelineName;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
    
}
