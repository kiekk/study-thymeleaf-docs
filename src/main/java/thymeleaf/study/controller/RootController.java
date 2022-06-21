package thymeleaf.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import thymeleaf.study.entity.User;

@Controller
@RequestMapping("")
public class RootController {

    @RequestMapping({"", "/"})
    public String root(Model model) {
        User user = new User();
        user.setId("id_1");
        user.setName("홍길동");
        user.setMobile("010-1234-5678");

        model.addAttribute("message", "hello thymeleaf");
        model.addAttribute("user", user);
        return "main";
    }
}
