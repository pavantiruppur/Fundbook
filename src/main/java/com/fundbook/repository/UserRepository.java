package com.fundbook.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fundbook.entity.User;

@RepositoryRestResource
public interface UserRepository extends PagingAndSortingRepository<User, Long> {//CrudRepository<User, Long>{

}
