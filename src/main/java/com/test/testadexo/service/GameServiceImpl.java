package com.test.testadexo.service;


import com.test.testadexo.model.GameContent;
import com.test.testadexo.util.UtilService;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class GameServiceImpl implements GameService {

    private GameContent gameContent;
    private UtilService utilService;

    public GameServiceImpl(GameContent gameContent, UtilService utilService) {
        this.gameContent = gameContent;
        this.utilService = utilService;
    }

    @Override
    public GameContent getGameContent() throws NoSuchAlgorithmException {
        gameContent.setColor(utilService.getCardColorShuffle());
        gameContent.setValue(utilService.getCardTypeShuffle());
        gameContent.setGame(utilService.getRandomGame());
        gameContent.setGameSorted(utilService.getGameSortedBycolorAndType(gameContent.getGame(),gameContent.getColor(),gameContent.getValue()));
        return gameContent;
    }
}
