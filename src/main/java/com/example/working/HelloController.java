package com.example.working;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String home() {
        return """
		<font color=green><h1>Ashin Tom Mathew 
		""";
    }
}
