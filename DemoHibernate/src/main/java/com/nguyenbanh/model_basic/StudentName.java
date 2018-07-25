package com.nguyenbanh.model_basic;


import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class StudentName {


    @Column(name = "student_fname")
    String first_name;

    @Column(name = "student_lname")
    String last_name;

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
