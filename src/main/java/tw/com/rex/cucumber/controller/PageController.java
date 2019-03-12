package tw.com.rex.cucumber.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {

    @RequestMapping("/register")
    public String toRegister() {
        return "register";
    }

}
