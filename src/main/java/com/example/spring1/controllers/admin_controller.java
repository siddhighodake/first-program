package com.example.spring1.controllers;

import com.example.spring1.entities.student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class admin_controller
{
    @GetMapping("/studinfo")
    public ResponseEntity<student> student_info()
    {

        student st=new student();

          st.setId(1);
          st.setName("siddhi");
          st.setEmail("sid@gmail.com");
          st.setPassword("123");
          return ResponseEntity.status(HttpStatus.ACCEPTED).body(st);
    }

    //postmapping

    @PostMapping("/post")
    public student createstud(@RequestBody student st)
    {
        student st2=new student();
        st2.setId(st.getId());
        st2.setName(st.getName());
        st2.setEmail(st.getEmail());
        st2.setPassword(st.getPassword());


        return st2;


    }
}
