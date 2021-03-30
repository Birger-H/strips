package be.vdab.strips.controllers;

import be.vdab.strips.services.FiguurService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Birger Huysmans
 * @version 1.0
 */

@Controller
@RequestMapping("/")
public class IndexController {
    private final FiguurService service;

    public IndexController(FiguurService service) {
        this.service = service;
    }

    @GetMapping
    ModelAndView index() {
        return new ModelAndView("index", "figuren", service.findAll());
    }
}
