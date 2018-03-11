package com.afs.nats.dpsmh.repository;

import com.afs.nats.dpsmh.model.ClaimantHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClaimantHistoryRepository extends JpaRepository<ClaimantHistory, Long>{
}
