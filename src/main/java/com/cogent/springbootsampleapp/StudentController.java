package com.cogent.springbootsampleapp;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/students")
@RestController
public class StudentController {

//    @RequestMapping(value = "/students", method = RequestMethod.GET)
//    @GetMapping("/students")
    @GetMapping
    public String getStudents() {
        return "Get Method";
    }

//    @RequestMapping(value = "/students", method = RequestMethod.POST)
//    @PostMapping("/students")
    @PostMapping
    public String createStudent() {
        return "Post Method";
    }

//    @RequestMapping(value = "/students", method = RequestMethod.PUT)
//    @PutMapping("/students")
    @PutMapping
    public String updateStudents() {
        return "Put Method";
    }

//    @RequestMapping(value = "/students", method = RequestMethod.DELETE)
//    @DeleteMapping("/students")
    @DeleteMapping
    public String deleteStudents() {
        return "Delete Method";
    }
}
