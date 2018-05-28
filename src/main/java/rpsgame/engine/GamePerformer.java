package rpsgame.engine;

import rpsgame.player.Player;
import rpsgame.player.PlayerA;
import rpsgame.player.PlayerB;

public class GamePerformer {


	public static GameResult performGame(
			Player playerA,
			Player playerB,
			int roundCount) {

	
		int playerAVictoryCount = 0;
		int playerBVictoryCount = 0;
		int tieCount = 0;

		for (int i = 0; i < roundCount; i++) {
			int result = RoundPerformer.processRound(playerA, playerB);
			switch (result) {
			case 0:
				tieCount++;
				break;
			case 1:
				playerAVictoryCount++;
				break;
			case -1:
				playerBVictoryCount++;
				break;
			default:
				throw new IllegalArgumentException();

			}
		}

		return new GameResult(playerAVictoryCount, playerBVictoryCount, tieCount);

	}

}
