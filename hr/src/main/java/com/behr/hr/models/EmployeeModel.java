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
    private String birth;
    
    @Column(name = "employee_email", length = 100, nullable = false)
    private String email;
    
    @Column(name = "employee_phone_number", length = 20, nullable = false)
    private String phone_number;
    
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "employee_contract_type", nullable = false)
    private ContractTypeModel contract_type;
    
    @Column(name = "employee_active", nullable = false)
    private boolean active;

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

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phone_number = phoneNumber;
    }

    public ContractTypeModel getContractType() {
        return contract_type;
    }

    public void setContractType(ContractTypeModel contractType) {
        this.contract_type = contractType;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    
    
}
