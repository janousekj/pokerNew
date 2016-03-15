package com.company;

import com.company.logic.Game;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
	// write your code here
      while (true){
         int round = game.getTable().getRound();
          switch (round){
              case 0:
                  game.getTable().newGame();
                  while (true){

                  }

          }
      }
    }

}
