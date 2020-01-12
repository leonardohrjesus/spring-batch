package com.example.leonardo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.leonardo.model.Autobot;

@Repository
public interface AutobotRepository extends JpaRepository<Autobot, Integer>{
	

}
