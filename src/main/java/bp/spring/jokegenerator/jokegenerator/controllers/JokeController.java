package bp.spring.jokegenerator.jokegenerator.controllers;

import bp.spring.jokegenerator.jokegenerator.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class JokeController {

    public final JokeService jokeService;

    @Autowired
    public JokeController(@Qualifier("goodJokes") JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/chuck")
    public  String getJoke(Model model){
        String[] jokes = {jokeService.getJoke(),jokeService.getJoke(),jokeService.getJoke()};
        model.addAttribute("jokes",jokes);
        return "chuckJokes/instance";
    }


}
