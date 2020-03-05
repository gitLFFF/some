package com.lf.some;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/index")
    public String getIndex(){
        System.out.println("最近冲突解决流程");
        //冲突
        return "helloword";
    }
    @GetMapping("/index1")
    public String getIndex1(){

        return "helloword";
    }
}
