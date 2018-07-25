package com.nguyenbanh.springjpa.controller;


import com.nguyenbanh.springjpa.entity.Alien;
import com.nguyenbanh.springjpa.repository.AlienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Controller
public class AlienController {


    @Autowired
    AlienRepository alienRepository;

    @RequestMapping(value = "/")
    public String home(){

        return "home";

    }

    @RequestMapping(value = "/addAlien")
    public String addAlien(@RequestParam("name") String name,@RequestParam("mark") int mark){
        Alien a = new Alien();
        a.setName(name);
        a.setMarks(mark);
        alienRepository.addAlien(name,mark);
        return "home";
    }


    @RequestMapping(value ="/getAllAlien")
    public String getALlAlien(Model model){
        Iterable<Alien> aliens = alienRepository.findAll();
        List<Alien> listAlien  = new ArrayList<Alien>();

        for(Alien e : aliens){
            listAlien.add(e);
        }

        model.addAttribute("alien",listAlien.size());
        return "result";

    }


    @RequestMapping(value = "/checkNameAlien")
    public String checkNameALien(@RequestParam("name")String name,Model model){

        boolean check = alienRepository.existsByName(name);


        if(check){
            model.addAttribute("alien","ton tai");
        }else{
            model.addAttribute("alien","khong ton tai");
        }

        return "result";
    }

    @RequestMapping(value = "/getAlienID/{id}")
    public String getAlienID(@PathVariable int id ,Model model){

        Alien a = alienRepository.findById(id).orElse(new Alien());
        model.addAttribute("alien",a.toString());

        return "result";
    }

    @RequestMapping(value = "/getAlienByName")
    public String getAlienByName(@RequestParam(name = "name")String nameAlien,Model model){
        String AliensToString = null;
        System.out.println(nameAlien);
        List<Alien> listAlien = alienRepository.timtatca(nameAlien);
        System.out.println(nameAlien + "pass");
        for(Alien e : listAlien){
            AliensToString += e.toString();
        }
        model.addAttribute("alien",AliensToString);

        return "result";
    }
    @RequestMapping(value =  "/checkNameAlienProcedure")
    public String checkAlienWithProcedure(@RequestParam("name")String name,Model model){

        boolean check = alienRepository.CHECK_ALIEN(name);

        if(check){
            model.addAttribute("alien","ton tai");
        }else{
            model.addAttribute("alien","khong ton tai");
        }


        return "result";
    }


}














