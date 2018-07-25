package com.nguyenbanh.model_relationship_mapping.one_to_many;


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

    @ManyToOne
    @JoinColumn(name = "laptop_id")
    private Laptop laptop;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
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
