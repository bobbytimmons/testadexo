package com.test.testadexo.controler;

import com.test.testadexo.model.GameContent;
import com.test.testadexo.service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GeneratorControlerImpl implements GeneratorControler {

    GameService gameService;

    public GeneratorControlerImpl(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/")
    public String whatever(Model model) {
        GameContent gameContent = gameService.getGameContent();
        model.addAttribute("orderColor", gameContent.getColor());
        model.addAttribute("orderValue", gameContent.getValue());
        model.addAttribute("game", gameContent.getGame());
        model.addAttribute("gameSorted", gameContent.getGameSorted());
        return "index";
    }

}
