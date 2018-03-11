//package com.afs.nats.dpsmh.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.data.rest.core.annotation.RestResource;
//import org.springframework.stereotype.Repository;
//
//import com.afs.nats.dpsmh.model.User;
//
//
//@RepositoryRestResource
//public interface UserRepository extends JpaRepository<User, Long> {
//	@RestResource(path = "by-name")
//	User findByUsername(@Param("name") String username);
//}
