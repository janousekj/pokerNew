package com.company.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Jakub Janoušek on 12.03.2016.
 */
public class TableTest {
    private Table myTable;
    int valueOfRaise;


    @org.junit.Before
    public void setUp() throws Exception {
        myTable = new Table();
        valueOfRaise = 40;
        myTable.createPlayer(5000);



    }

    @org.junit.Test
    public void testPlaceBetCall() throws Exception {
        int valueOfHighestBet = 40;
        myTable.setHighestBet(valueOfHighestBet);
        int newValueOfChips = myTable.currentPlayer().getChips()-valueOfHighestBet;

        int highestBet = myTable.getHighestBet();

        assertTrue(myTable.playerPlaceBet());
        assertEquals(myTable.currentPlayer().getChips(),newValueOfChips);
    }
    @org.junit.Test
    public void testPlaceBetRaise()throws Exception {
        int newValueOfPot = myTable.getPot()+valueOfRaise;

        assertTrue(myTable.playerPlaceBet(valueOfRaise));
        assertEquals(myTable.getPot(), newValueOfPot);
    }
    @org.junit.Test
    public void testCheck()throws Exception {
        assertTrue(myTable.playerCheck());
    }
    @org.junit.Test
    public void testCreatePlayer()throws Exception{
        int currentSize = myTable.getPlayerList().size();
        myTable.createPlayer(5000);
        int newSize = myTable.getPlayerList().size();

        assertEquals(currentSize+1, newSize);
    }


}
