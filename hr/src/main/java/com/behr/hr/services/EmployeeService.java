package com.behr.hr.services;

import com.behr.hr.models.EmployeeModel;
import com.behr.hr.repositories.EmployeeRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sara
 */
@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    
    
    
    public ArrayList<EmployeeModel> activeEmployees(){
        return (ArrayList<EmployeeModel>) employeeRepository.findByActive(true);
    }
    
    public Optional<EmployeeModel> employeeById(int id){
        return (Optional<EmployeeModel>) employeeRepository.findById(id);
    }
    
    public EmployeeModel saveEmployee(String email, EmployeeModel employee){
        if (employeeRepository.existEmail(email)==0) {
            return employeeRepository.save(employee);
        }
        else return new EmployeeModel();
    }
    
    public void updateEmployee(int id){
        employeeRepository.deleteEmployeeById(id);
    }
    
}
