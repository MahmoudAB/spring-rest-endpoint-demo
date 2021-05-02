package com.restapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestControllerDemo {

    @GetMapping("/best/customer")
    public @ResponseBody String getBestCustomer(){
        return "Buddy Bob";
    }

}
