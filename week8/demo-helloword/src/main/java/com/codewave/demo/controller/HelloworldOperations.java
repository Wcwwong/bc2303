package com.codewave.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.codewave.demo.model.ExternalResponse;

public interface HelloworldOperations {
  
  @GetMapping(value = "/greeting")
  String sayHello();

  @GetMapping(value = "/persons")
  ExternalResponse getPersons();
}
