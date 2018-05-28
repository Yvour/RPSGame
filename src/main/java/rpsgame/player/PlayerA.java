package rpsgame.player;

import rpsgame.engine.Choice;

public class PlayerA implements Player{
	
  public Choice makeChoice() {
	  return Choice.PAPER;
  }
}
