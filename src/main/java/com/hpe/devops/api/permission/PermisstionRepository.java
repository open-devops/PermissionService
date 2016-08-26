package com.hpe.devops.api.permission;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PermisstionRepository extends MongoRepository<Permission, String> {

	List<Permission> findByPipelineId(String pipelineId);
}
