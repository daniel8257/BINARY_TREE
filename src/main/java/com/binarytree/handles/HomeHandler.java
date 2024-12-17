package com.binarytree.handles;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeHandler {

    @GetMapping("/")
    public String indexPage() {
        return "index"; // This should load src/main/resources/templates/index.html
    }
}
