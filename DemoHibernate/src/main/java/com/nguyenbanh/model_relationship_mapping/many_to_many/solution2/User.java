package com.nguyenbanh.model_relationship_mapping.many_to_many.solution2;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "USERs")
public class User {


    @Id
    @Column(name = "user_id")
    private int id;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_email")
    private String email;

    @OneToMany(mappedBy = "user")
    private Set<User_Group> user_groups = new HashSet<User_Group>();


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<User_Group> getUser_groups() {
        return user_groups;
    }

    public void setUser_groups(Set<User_Group> user_groups) {
        this.user_groups = user_groups;
    }
}
