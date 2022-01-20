package com.test.testadexo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
@Setter
public class GameContent {

    private List<Card> game;
    private List<Card> gameSorted;
    private List<Color> color;
    private List<Value> value;



}
