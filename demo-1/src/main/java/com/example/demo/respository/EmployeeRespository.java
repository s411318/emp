package com.example.demo.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Integer> {
	
List<Employee> findAll();

@Query(value = "select * from employee where id = :empId", nativeQuery = true)
List<Employee> findsById(@Param("empId") int empId);
	
@Query(value = "select * from product where UNITPRICE > 1000 and code = :productCode", nativeQuery = true)
List<Employee> findMaxPrice(@Param("productCode") String productCode);


}
