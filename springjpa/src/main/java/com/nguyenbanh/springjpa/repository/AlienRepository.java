package com.nguyenbanh.springjpa.repository;
import com.nguyenbanh.springjpa.entity.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface AlienRepository extends JpaRepository<Alien,Integer> {


    //@Procedure(name = "addalien")
    //@Query(value = "{call PKG_ALIEN.ADDALIEN(,:mark)} ",nativeQuery = true)
    @Procedure(name = "PKG_ALIEN.ADDALIEN")
    void addAlien(@Param("p_name")String name,@Param("mark")int mark);


    boolean existsByName(@Param("name") String name);


    @Query(value = "SELECT * FROM ALIEN  WHERE ALIEN.ALIEN_NAME = :name",nativeQuery = true)
    List<Alien> timtatca(@Param("name")String name);


    @Procedure(name = "PKG_ALIEN.")
    boolean CHECK_ALIEN(String p_name);

}