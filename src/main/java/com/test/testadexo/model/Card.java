package com.test.testadexo.model;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Card {
    private Value value;
    private Color color;
    private String image;

    public Card(Value value, Color color) {
        this.value = value;
        this.color = color;
        this.image = "images/"+value.name()+color.name()+".gif";
    }

}
