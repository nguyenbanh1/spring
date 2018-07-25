package com.nguyenbanh.springjpa.entity;



import javax.persistence.*;

@Entity
@Table(name = "ALIEN")
//@NamedStoredProcedureQueries({
//        @NamedStoredProcedureQuery( name = "addalien", procedureName = "PKG_ALIEN.ADDALIEN", parameters = {
//                        @StoredProcedureParameter(mode = ParameterMode.IN,name = "p_name",type = String.class),
//                        @StoredProcedureParameter(mode = ParameterMode.IN,name = "mark",type = Integer.class)
//                }
//        ),
//        @NamedStoredProcedureQuery(
//                name = "Alien.findAlienViProcedure",
//                procedureName = "PKG_ALIEN_JPA.GETALLALIEN",
//                resultClasses = Alien.class,parameters = {
//                    @StoredProcedureParameter(name = "o_res",mode = ParameterMode.REF_CURSOR,type = void.class)
//        })
//})
public class Alien {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "ALIEN_ID")
    private int id;



    @Column(name = "ALIEN_NAME")
    private String name;

    @Column(name = "MARKS")
    private int marks;


    public int getId() {
        return id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
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


    public String toString(){
        return "[Alien : id  = " + id + ", name = " + name + ", marks : " + marks + " ]";
    }

}
