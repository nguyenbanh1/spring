package com.nguyenbanh.model_relationship_mapping.many_to_many.solution1;


import com.nguyenbanh.model_relationship_mapping.many_to_many.solution1.Employee;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "laptop")
public class Laptop {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "laptop_name")
    private String name;

    @ManyToMany(mappedBy = "laptops")
    private List<Employee> employees = new ArrayList<Employee>();


    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }


}
