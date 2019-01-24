package com.sid.dao;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sid.entities.Agent;

public interface AgentRepository extends JpaRepository<Agent, Long> {
	@Query("Select a from Agent a where a.name like:x")
	public Page<Agent> chercher(@Param("x")String mc, Pageable pageable);
	
	

}
