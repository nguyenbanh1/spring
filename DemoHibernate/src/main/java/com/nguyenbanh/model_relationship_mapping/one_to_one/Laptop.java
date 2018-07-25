package com.nguyenbanh.model_relationship_mapping.one_to_one;


import javax.persistence.*;

@Entity
@Table(name = "laptop")
public class Laptop {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "laptop_name")
    private String name;


    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }


}
