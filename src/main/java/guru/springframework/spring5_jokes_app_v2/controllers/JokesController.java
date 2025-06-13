package guru.springframework.spring5_jokes_app_v2.controllers;

import guru.springframework.spring5_jokes_app_v2.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokesService.getJoke());

        return "index";
    }
}
