package rpsgame.engine;

public enum Choice {
   ROCK,
   PAPER,
   SCISSORS;
   
   private Choice winner;
   private Choice beaten;
 
   static {
	   ROCK.winner = PAPER;
	   PAPER.winner = SCISSORS;
	   SCISSORS.winner = ROCK;
	   
	   ROCK.beaten = SCISSORS;
	   PAPER.beaten = ROCK;
	   SCISSORS.beaten = PAPER; 
   }
   
   public Choice getBeaten() {
	   return beaten;
   }
   public Choice getWinner() {
	   return winner;
   }
   
}
