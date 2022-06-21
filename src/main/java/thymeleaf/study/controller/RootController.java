package thymeleaf.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class RootController {

    @RequestMapping({"", "/"})
    public String root(Model model) {
        model.addAttribute("message", "hello thymeleaf");
        return "main";
    }
}
