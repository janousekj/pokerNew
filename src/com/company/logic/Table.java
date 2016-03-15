package com.company.logic;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jakub Janoušek on 10. 2. 2016.
 */
public class Table {
    int pot;
    private List<PokerCard> cardsOnTheTable;
    private int highestBet;
    Deck deck;
    List<Player> playerList;
    int round;
    private int indexOfDealer;


    public int getPot() {
        return pot;
    }

    public void setPot(int pot) {
        this.pot = pot;
    }

    public List<PokerCard> getCardsOnTheTable() {
        return cardsOnTheTable;
    }

    public void setCardsOnTheTable(List<PokerCard> cardsOnTheTable) {
        this.cardsOnTheTable = cardsOnTheTable;
    }

    public int getHighestBet() {
        return highestBet;
    }

    public void setHighestBet(int highestBet) {
        this.highestBet = highestBet;
    }
    public void createPlayer(int chips){
        playerList.add(new Player(chips));
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public void newGame(){
        pot = 0;
        highestBet = 0;
        if (indexOfDealer+1<playerList.size()) {
            indexOfDealer++;
        }else {
            indexOfDealer=0;
        }
        deck = new Deck();
        deck.shuffle();
        for (Player p : playerList){
            p.getCards(deck.draw(),deck.draw());

        }
    }


    public boolean playerPlaceBet(){
        if (currentPlayer().getChips()>(highestBet-currentPlayer().getMyBet())) {
            currentPlayer().setChips(currentPlayer().getChips()-(highestBet-currentPlayer().getMyBet()));
            pot+=highestBet-currentPlayer().getMyBet();
            return true;
        }
        return false;
    }

    public boolean playerPlaceBet(int valueOfBet) {
        if (currentPlayer().getChips()>valueOfBet) {
            currentPlayer().setChips(currentPlayer().getChips()-valueOfBet);
            pot+=valueOfBet;
            return true;
        }
        return false;
    }

    public void playerFold(){
        currentPlayer().setFolded(true);
    }
    public boolean playerCheck(){
        if (highestBet==currentPlayer().getMyBet()) {
            return true;
        }
        return false;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public Player currentPlayer(){
        return playerList.get(round);
    }

    public Table() {
        this.pot = 0;
        this.cardsOnTheTable = new ArrayList<>();
        this.highestBet = 0;
        this.deck = new Deck();
        deck.shuffle();
        this.playerList = new ArrayList<>();
        this.round = 0;
    }
}
