package com.behr.hr.models;

import java.util.Date;
import javax.persistence.*;
/**
 *
 * @author Sara
 */
@Entity
@Table(name = "employee")
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", unique = true, nullable = false)
    private int id;
    
    @Column(name = "employee_name", length = 30, nullable = false)
    private String name;
    
    @Column(name = "employee_surnames", length = 80, nullable = false)
    private String surnames;
    
    @Column(name = "employee_birth", nullable = false)
    private Date birth;
    
    @Column(name = "employee_email", length = 100, nullable = false)
    private String email;
    
    @Column(name = "employee_phoneNumber", length = 12, nullable = false)
    private String phoneNumber;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_contractType", nullable = false)
    private ContractTypeModel contractType;
    private boolean isActive;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ContractTypeModel getContractType() {
        return contractType;
    }

    public void setContractType(ContractTypeModel contractType) {
        this.contractType = contractType;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    
}
