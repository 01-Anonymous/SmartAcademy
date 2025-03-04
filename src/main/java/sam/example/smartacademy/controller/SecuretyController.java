package sam.example.smartacademy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecuretyController {

    @GetMapping("/")
    public String hi() {
        return "hi";
    }
    
}
