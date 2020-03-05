package com.lf.some;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/index")
    public String getIndex(){
        System.out.println("最近冲突解决流程");
        System.out.println("我自己修改的代码");
        System.out.println("我自己修改的代码2");
        System.out.println("我的分支代码");
        System.out.println("dddd");
        //冲突
        return "helloword";
    }
    @GetMapping("/index1")
    public String getIndex1(){
            System.out.println("他人修改");
        return "helloword";
    }
}
