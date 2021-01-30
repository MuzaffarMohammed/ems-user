package com.appseonit.ems.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appseonit.ems.user.entity.EmsUser;

@Repository
public interface UserJPARepository extends JpaRepository<EmsUser, Integer>{
	
	
	EmsUser findOneByUserName(String userName);

}
