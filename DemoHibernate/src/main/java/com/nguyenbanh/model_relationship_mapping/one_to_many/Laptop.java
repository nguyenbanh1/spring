package com.nguyenbanh.model_relationship_mapping.one_to_many;

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

    @OneToMany(mappedBy = "laptop")
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
