package com.afs.nats.dpsmh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afs.nats.dpsmh.model.Organization;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface OrganizationRepository extends JpaRepository<Organization, Long> {
//	@RestResource(path = "by-enable")
//	List<Organization>findByEnable(@Param("enable") Boolean enable);
}
