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

@Query(value = "select * from Punch where id = :id and checkstatus = :status", nativeQuery = true)
List<Punch> findbyIdStatus(@Param("id") String id,@Param("status") String status);

@Query(value = "select * from punch where SUBSTR(CHECKTIME,1,10)= :day and id= :id", nativeQuery = true)
List<Punch> findbyDayId(@Param("day") String day,@Param("id") String id);

List<Punch> findAll();

@Query(value ="select * from punch where SUBSTR(CHECKTIME,1,10)<= :fromday1 and SUBSTR(CHECKTIME,1,10)>= :endday2 and id= :id",nativeQuery = true)
List<Punch> findIdWeekly(@Param("fromday1") String fromday1,@Param("endday2") String endday2,@Param("id") String id);
	

}
