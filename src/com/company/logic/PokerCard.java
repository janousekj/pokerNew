package com.company.logic;

/**
 * Created by Jakub Janoušek on 10. 2. 2016.
 */
public class PokerCard {
    public final Rank rank;
    public final Pip pip;

    public PokerCard(Rank rank, Pip pip) {
        this.rank = rank;
        this.pip = pip;
    }
}
