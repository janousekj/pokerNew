package com.company.logic;

import static org.junit.Assert.*;

/**
 * Created by Jakub Janoušek on 11.02.2016.
 */

public class DeckTest {

    private Deck myDeck;

    @org.junit.Before
    public void setUp() throws Exception {
        myDeck = new Deck();

    }

    @org.junit.Test
    public void testDraw() throws Exception {
        int currentSize = myDeck.size();
        PokerCard draw = myDeck.draw();
        int newSize = myDeck.size();

        assertEquals(currentSize-1, newSize);


    }



}