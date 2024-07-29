// src/main/java/MyPortfolio/Task1/controller/PortfolioController.java
package MyPortfolio.Task1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String home() {
        return "index";
    }
}
