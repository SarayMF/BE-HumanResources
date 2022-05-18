/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.behr.hr.repositories;

import com.behr.hr.models.EmployeeModel;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sara
 */
@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeModel, Integer>{
    
    public abstract ArrayList<EmployeeModel> findByActive(Boolean active);
    
    @Query(
            value = "if EXISTS ( SELECT * FROM employee WHERE employee_email LIKE %:email%)" +
                    " SELECT 1;" +
                    "else" +
                    " SELECT 0;",
            nativeQuery = true
    )
    int existEmail(@Param("email") String email);
    
    @Query(
            value = "UPDATE employee SET employee_active = 0 WHERE employee_id LIKE %:id%",
            nativeQuery = true
    )
    void deleteEmployeeById(@Param("id") int id);
}
