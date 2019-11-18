package com.example.demo.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Leave;
import com.example.demo.entity.Punch;
import com.example.demo.entity.User;

@Repository
public interface LeaveRespository extends JpaRepository<Leave, Integer> {
	
	@Query(value = "select * from leave where (:startTime between vacationstartdate and vacationenddate) or (:EndTime between vacationstartdate and vacationenddate) or(:startTime <=vacationstartdate and vacationenddate<=:EndTime ) ", nativeQuery = true)
	List<Leave> findsByTime(@Param("startTime") String startTime,@Param("EndTime") String EndTime);
	
}
