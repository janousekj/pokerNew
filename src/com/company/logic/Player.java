package com.company.logic;

/**
 * Created by Jakub Janoušek on 10. 2. 2016.
 */
public class Player {
    private int chips;
    private Hand hand;
    private int myBet;
    boolean isFolded;



    //private List<PokerCard> cardsOnHand;



    public Player(int chips) {

        this.chips = chips;
        this.myBet = 0;
        this.isFolded = false;


    }

    public void getCards(PokerCard firstCard, PokerCard secondCard){
        hand = new Hand(firstCard,secondCard);
    }

    public int getMyBet() {
        return myBet;
    }

    public void setMyBet(int myBet) {
        this.myBet = myBet;
    }

    public int getChips() {
        return chips;
    }

    public void setChips(int chips) {
        this.chips = chips;
    }

    public boolean isFolded() {
        return isFolded;
    }

    public void setFolded(boolean folded) {
        isFolded = folded;
    }

}