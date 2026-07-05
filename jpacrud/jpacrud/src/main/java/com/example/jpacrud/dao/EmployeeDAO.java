package com.example.jpacrud.dao;

import com.example.jpacrud.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeDAO extends JpaRepository<Employee,Integer>{


}
