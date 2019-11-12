package com.example.demo.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Punch;
import com.example.demo.entity.User;

@Repository
public interface UserRespository extends JpaRepository<User, Integer> {
	
User findById(int id);

@Query(value = "select * from user where account = :account and pswd = :password", nativeQuery = true)
List<User> findbyNamePswd(@Param("account") String account,@Param("password") String password);

}
