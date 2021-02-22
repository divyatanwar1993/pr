package net.codejava;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class webcontroller {

    @RequestMapping("/hello")
    public String sayHello(){

System.out.println("saying hello to springboot");
        return "hello";
    }
}
