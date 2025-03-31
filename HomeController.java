package com.Minh.SpringBootWebProject1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@RequestMapping("/")
    public String home()
    {
        System.out.println("controller called");
        return "index";
    }
}
