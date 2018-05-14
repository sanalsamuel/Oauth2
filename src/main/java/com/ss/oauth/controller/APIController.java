package com.ss.oauth.controller;
 
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ss.oauth.model.Message;
import com.ss.oauth.model.User;
 
@RestController
public class APIController {
 

 

   
    @RequestMapping(value = "/api/test", method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<List<User>> listAllUsers( @RequestBody Message message,HttpSession session) {
       
    	User user = new User(3l,message.getName(), 29, 10000.00);
       	System.out.println("HelloWorldRestController Session " +session.getId() );
    	session.setAttribute("user", user);
    	List<User> users = new ArrayList<>();
    	users.add(user);
        if(users.isEmpty()){
            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
 
 
 
 
}