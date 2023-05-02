package com.codewave.demo.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codewave.demo.controller.HelloworldOperations;
import com.codewave.demo.model.ExternalResponse;
import com.codewave.demo.model.School;
import com.codewave.demo.service.impl.PersonServiceImpl;
import com.codewave.demo.service.impl.SchoolServiceImpl;

@Controller
@ResponseBody //default JSON
@RequestMapping(value = "/api/v1")
public class HelloworldController implements HelloworldOperations {

  @Autowired // get PersonServiceImpl object from SpringContext
  PersonServiceImpl p; // inject personServiceImpl object into p

  @Autowired
  SchoolServiceImpl s;
  
  @Override
  public String sayHello(){
    return "Hello World!";

  }
  /**
   * get all person data from database table Persons
   */
  @Override
  public ExternalResponse getPersons(){
    // practice person array


       School s2 = s.getSchools().stream()
                        .filter(e -> e.getName().startsWith("ABC")) // after filter, List<School>
                        .findFirst()
                        .orElse(new School());
                        
       return ExternalResponse.builder()
                              .school(s2)
                              .persons(p.getPersons())
                              .build();

  }

}
