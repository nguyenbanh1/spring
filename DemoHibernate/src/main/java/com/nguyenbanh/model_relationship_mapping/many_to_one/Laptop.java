package com.nguyenbanh.model_relationship_mapping.many_to_one;

import javax.persistence.*;

@Entity
@Table(name = "laptop")
public class Laptop {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "laptop_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee_id;

    public void setEmployees(Employee employee_id) {
        this.employee_id = employee_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }


}
