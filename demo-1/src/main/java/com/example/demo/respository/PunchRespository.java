package com.example.demo.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Punch;

@Repository
public interface PunchRespository extends JpaRepository<Punch, Integer> {
	
List<Punch> findAllById(int id);
	

}
