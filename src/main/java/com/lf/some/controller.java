package com.lf.some;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/index")
    public String getIndex(){
        
        //冲突
        return "helloword";
    }
}