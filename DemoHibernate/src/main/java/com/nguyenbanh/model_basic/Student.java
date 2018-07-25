package com.nguyenbanh.model_basic;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "student_id")
    private int student_id;

    private StudentName student_name;


    @Column(name = "student_color")
    private String student_color;


    public void setStudent_name(StudentName student_name) {
        this.student_name = student_name;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }


    public void setStudent_color(String student_color) {
        this.student_color = student_color;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", student_name='" + student_name + '\'' +
                ", student_color='" + student_color + '\'' +
                '}';
    }
}