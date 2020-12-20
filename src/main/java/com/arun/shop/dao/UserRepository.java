package com.arun.shop.dao;

import javax.persistence.Entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.arun.shop.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{

}
