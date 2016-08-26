package com.hpe.devops.api.permission;

import org.springframework.data.annotation.Id;

public class Permission {

    private String id;

    private String organizationId;
    
    private String pipelineId;
    
    private String accountId;
    
    private String roleId;
    
    public Permission(){
    	
    }

	public Permission(String organizationId, String pipelineId, String accountId, String roleId) {
		super();
		this.organizationId = organizationId;
		this.pipelineId = pipelineId;
		this.accountId = accountId;
		this.roleId = roleId;
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

	public String getPipelineId() {
		return pipelineId;
	}

	public void setPipelineId(String pipelineId) {
		this.pipelineId = pipelineId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
    
}
