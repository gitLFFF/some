package com.lf.some;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/index")
    public String getIndex(){
        System.out.println("他人提交");
        //冲突
        return "helloword";
    }
    @GetMapping("/index1")
    public String getIndex1(){
        System.out.println("我人提交");
        //冲突
        return "helloword";
    }
}
