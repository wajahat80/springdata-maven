package com.rwa.spring.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rwa.spring.jpa.entity.Server;
import com.rwa.spring.jpa.entity.ServerPK;



public interface ServerRepo extends JpaRepository<Server, ServerPK> {

}
