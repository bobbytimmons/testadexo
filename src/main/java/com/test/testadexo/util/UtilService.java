package com.test.testadexo.util;

import com.test.testadexo.model.Card;
import com.test.testadexo.model.Color;
import com.test.testadexo.model.Value;

import java.security.NoSuchAlgorithmException;
import java.util.List;

public interface UtilService {

    List<Color> getCardColorShuffle();

    List<Value> getCardTypeShuffle();

    List<Card> getRandomGame() throws NoSuchAlgorithmException;

    List<Card> getGameSortedBycolorAndType(List<Card> randomGame, List<Color> randoColor, List<Value> randomValue);
}
