package wordsgame.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wordsgame.service.CityService;

@RestController
@RequestMapping("/words-game")
public class GameController {
    private final CityService service;

    public GameController(CityService service) {
        this.service = service;
    }

    @GetMapping("/begin")
    public String startGame() {
        return service.getFirstCity();
    }

    @GetMapping("/next")
    public String getNext(@RequestParam String word) {
        return service.getNext(word);
    }

    @PostMapping("/end")
    public String endGame() {
        return "Thanks for game!";
    }
}
