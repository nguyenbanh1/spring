package com.nguyenbanh.model_relationship_mapping.many_to_one;


import javax.persistence.*;


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
