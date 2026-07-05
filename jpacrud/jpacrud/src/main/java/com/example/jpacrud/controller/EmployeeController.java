package com.example.jpacrud.controller;

import com.example.jpacrud.bean.Employee;
import com.example.jpacrud.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("/save")
    public String saveRecord()
    {
        Employee e = new Employee("Lokesh","Account","Mumbai");
        employeeDAO.save(e);
        return "Record INserted Successfully. Id is "+e.getEmpid();
    }




}
