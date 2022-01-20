package com.test.testadexo.util;

import com.test.testadexo.model.Card;
import com.test.testadexo.model.Color;
import com.test.testadexo.model.Value;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class UtilServiceImpl implements UtilService {

    @Override
    public List<Color> getCardColorShuffle() {
        List<Color> color =this.getCardColor();
        Collections.shuffle(color);
        return color;
    }

    @Override
    public List<Value> getCardTypeShuffle() {
        List<Value> type= this.getCardType();
        Collections.shuffle(type);
        return type;
    }

    @Override
    public List<Card> getRandomGame(){
        Random rand = new Random();
        List<Card> fullGame =this.getFullGame();
        List<Card> randomGame = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int randomIndex = rand.nextInt(fullGame.size());
            randomGame.add(fullGame.get(randomIndex));
            fullGame.remove(randomIndex);
        }
        return randomGame;
    }

    @Override
    public List<Card> getGameSortedBycolorAndType(List<Card> randomGame, List<Color> randoColor, List<Value> randomValue){
        List<Card> finalGame = new LinkedList<>();
        randoColor.forEach(color->{
            List<Card> gameByColor =randomGame.stream().filter(card -> card.getColor().equals(color)).collect(Collectors.toList());
            finalGame.addAll(sortByType(gameByColor,randomValue));
        });
        return finalGame;
    }

    private  List<Card> sortByType(List<Card> cards, List<Value> value){
        List<Card>  cardByColor = new LinkedList<>();
        value.forEach(c -> cardByColor.addAll(cards.stream().filter(card -> card.getValue().equals(c)).collect(Collectors.toList())));
        return cardByColor;
    }

    private List<Color> getCardColor() {
        return Arrays.asList(Color.PIQUE,Color.COEUR,Color.CARREAU,Color.TREFLE);
    }
    private List<Value> getCardType() {return Arrays.asList(Value.AS,Value.DEUX,Value.TROIS,Value.QUATRE,Value.CINQ,Value.SIX,Value.SEPT,Value.HUIT,Value.NEUF,Value.DIX,Value.VALET,Value.DAME,Value.ROI);
    }

    private List<Card> getFullGame(){
        List<Card> fullGame= new LinkedList<>();
        this.getCardColor().forEach(color-> this.getCardType().forEach(type->fullGame.add(new Card( type,color))));
         return fullGame;

    }
}
