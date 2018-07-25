package com.nguyenbanh.model_relationship_mapping.many_to_many.solution1;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "id")
    private int id;


    @Column(name = "employee_name")
    private String name;

    @Column(name = "employee_marks")
    private int marks;

    @ManyToMany
    @JoinTable(name = "employee_laptop",
            joinColumns = @JoinColumn(name = "employment_id"),
            inverseJoinColumns = @JoinColumn(name = "laptop_id")

    )
    private List<Laptop> laptops = new ArrayList<Laptop>();


    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}
