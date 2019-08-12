package com.codingdojo.routingproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//...
@RestController
public class CodingController {
 @RequestMapping("/coding")
 public String index(){
   return "Hello Coding Dojo!";
 }

 @RequestMapping(value="/coding/hello", method=RequestMethod.GET)
 public String hello(){
   return "Hello world! What route did you use to access me?";
 }
 @RequestMapping("/coding/python")
 public String world(){
   return "Python/Django was awesome!";
 }
 
 @RequestMapping("/Java")
 public String random(){
   return "Java/Spring is better!!";
 }
}

