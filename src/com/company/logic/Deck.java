package com.company.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Jakub Janoušek on 10. 2. 2016.
 */
public class Deck {

    private List<PokerCard> cardList;
    public Deck() {
        this.cardList = new ArrayList<>();
        for (Pip pip : Pip.values()){
            for (Rank rank : Rank.values()){
                cardList.add(new PokerCard(rank, pip));
            }
        }
    }

    public PokerCard draw(){
        PokerCard pokerCard = cardList.get(cardList.size() - 1);
        cardList.remove(cardList.size()-1);
        return pokerCard;
    }

    public void shuffle(){
        Collections.shuffle(cardList);

    }
    public int size(){
        return cardList.size();
    }

}
