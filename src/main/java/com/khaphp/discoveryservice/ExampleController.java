package com.khaphp.discoveryservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @Value("${author.name}")
    private String author;
    @Value("${birthday.year}")
    private String birthdayYear;

    @GetMapping("/author")
    public String hello() {
        return "© 2024 BlueEyesssss (" + author + " - " + birthdayYear + ")";
    }
}
