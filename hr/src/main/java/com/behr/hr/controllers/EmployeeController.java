/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.behr.hr.controllers;

import com.behr.hr.models.EmployeeModel;
import com.behr.hr.services.EmployeeService;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Sara
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    
    @GetMapping()
    public ArrayList<EmployeeModel> getActiveEmployees(){
        return employeeService.activeEmployees();
    }
    
    @PostMapping()
    public EmployeeModel saveEmployee(@RequestBody EmployeeModel employee){
        return employeeService.saveEmployee(employee.getEmail(), employee);
    }
    
    @GetMapping(path = "/{id}")
    public Optional<EmployeeModel> getEmployeById(@PathVariable("id") int id){
        return this.employeeService.employeeById(id);
    }
    
    @DeleteMapping(path = "/{id}")
    public void deleteEmployee(@PathVariable("id") int id){
        this.employeeService.updateEmployee(id);
    }
        
}
