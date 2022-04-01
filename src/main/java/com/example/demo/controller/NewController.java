package com.example.demo.controller;

import com.example.demo.Students;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/*
localhost:8080/

header:

Accept : application/json or(both) application/xml

 */

@RestController
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class NewController {

    Students students= new Students();

    @RequestMapping("/")
    @ResponseBody
    Students index(){
        students.setName("Kumar Vaduganathan");
        students.setCity("Bangalore");
         return  students;
    }



}
