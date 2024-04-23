package com.cogent.springbootsampleapp;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // http://localhost:8080/hello
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello World";
    }

    // http://localhost:8080/hello/john - route parameter
    // http://localhost:8080/hello?name=john - query string
    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public String helloWithName(@PathVariable("name") String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/hello/{fname}/{lname}", method = RequestMethod.GET)
    public String helloWithFullName(@PathVariable("fname")String firstName,
                                    @PathVariable("lname") String lastName) {
        return "Hello " + firstName + " " + lastName;
    }
}
