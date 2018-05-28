package rpsgame;

import rpsgame.engine.GameResult;
import rpsgame.engine.GameResultDescriber;
import rpsgame.player.Player;
import rpsgame.player.PlayerA;
import rpsgame.player.PlayerB;
import rpsgame.engine.GamePerformer;

public class RPSGame {

	public static void main(String[] args) {
		int roundCount = 100;
		Player playerA = new PlayerA();
		Player playerB = new PlayerB();
		GameResult gameResult = GamePerformer.performGame(playerA, playerB, roundCount);
		System.out.println(GameResultDescriber.describe(gameResult));

	}

}
