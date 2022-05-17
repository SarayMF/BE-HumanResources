package com.behr.hr.models;

import javax.persistence.*;
/**
 *
 * @author Sara
 */
@Entity
@Table(name = "contract_type")
public class ContractTypeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_type_id", unique = true, nullable = false)
    private int id;
    
    @Column(name = "contract_type_name", nullable = false)
    private String name;
    
    @Column(name = "contract_type_description", nullable = true)
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
