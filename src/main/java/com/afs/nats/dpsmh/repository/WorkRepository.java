package com.afs.nats.dpsmh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.afs.nats.dpsmh.model.Work;


@RepositoryRestResource
public interface WorkRepository extends JpaRepository<Work, Long> {

}
