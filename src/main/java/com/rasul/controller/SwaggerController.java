package com.rasul.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SwaggerController {

    @GetMapping("hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("post/{id}")
    public @ResponseBody  ResponseEntity<String> post(@PathVariable Integer id){
      return ResponseEntity.ok().body("post"+id);
    }

}
