package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/owners"}) //when a single mapping in a class
@Controller
public class OwnerController {

    @RequestMapping({"" ,"/", "/index", "/index.html"})
    public String listOwners() {
        return "/owners/index";
    }
}
