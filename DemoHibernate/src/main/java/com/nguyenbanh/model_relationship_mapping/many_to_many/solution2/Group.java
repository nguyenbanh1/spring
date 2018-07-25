package com.nguyenbanh.model_relationship_mapping.many_to_many.solution2;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "GROUPs")
public class Group {

    @Id
    @Column(name = "group_id")
    private int id;

    @Column(name = "Group_name")
    private String name;

    @OneToMany(mappedBy = "group")
    private Set<User_Group> user_groupSet = new HashSet<User_Group>();


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

    public Set<User_Group> getUser_groupSet() {
        return user_groupSet;
    }

    public void setUser_groupSet(Set<User_Group> user_groupSet) {
        this.user_groupSet = user_groupSet;
    }
}
