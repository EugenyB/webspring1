package ua.mk.berkut.webspring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.mk.berkut.webspring1.data.Person;

@Controller
public class HelloController {

    @PostMapping("/hello")
    public String hello(@RequestParam("name") String user, @RequestParam int age, Model model) {
        Person p = new Person(user, age);
        model.addAttribute("person", p);
        return "hello";
    }
}
