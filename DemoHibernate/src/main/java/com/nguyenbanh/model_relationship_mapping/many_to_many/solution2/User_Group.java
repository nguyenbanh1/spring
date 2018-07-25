package com.nguyenbanh.model_relationship_mapping.many_to_many.solution2;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_group")
public class User_Group {

    @Id
    @Column(name = "user_group_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;


    @Column(name = "createday")
    private String createDay = new Date().toString();

    @Column(name = "status")
    private String Status = "1";


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getCreateDay() {
        return createDay;
    }

    public void setCreateDay(String createDay) {
        this.createDay = createDay;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
