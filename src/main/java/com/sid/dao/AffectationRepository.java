package com.sid.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sid.entities.Affectation;

public interface AffectationRepository extends JpaRepository<Affectation, Long> {

}
