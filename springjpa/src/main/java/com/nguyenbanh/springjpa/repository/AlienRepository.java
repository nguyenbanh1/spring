package com.nguyenbanh.springjpa.repository;
import com.nguyenbanh.springjpa.entity.Alien;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;




public interface AlienRepository extends JpaRepository<Alien,Integer> {



    @Procedure(procedureName = "PKG_ALIEN.ADDALIEN" )
    void addAlien(@Param("p_id")int id,@Param("p_name")String name,@Param("p_mark")int mark);


}