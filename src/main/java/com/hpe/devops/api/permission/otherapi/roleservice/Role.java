package com.hpe.devops.api.permission.otherapi.roleservice;

public class Role {

    private String id;

    private String organizationId;
    
    private String name;
    
    private String description;

    public Role(){
    	
    }
    
	public Role(String organizationId, String name, String description) {
		super();
		this.organizationId = organizationId;
		this.name = name;
		this.description = description;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

        
}
