package rpsgame;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import rpsgame.engine.Choice;
import rpsgame.engine.RoundPerformer;
import rpsgame.player.Player;

public class RoundPerformerTest {

	private class RockPlayer implements Player {
		public Choice makeChoice() {
			return Choice.ROCK;
		}
	}

	private class ScissorsPlayer implements Player {
		public Choice makeChoice() {
			return Choice.SCISSORS;
		}
	}

	private class PaperPlayer implements Player {
		public Choice makeChoice() {
			return Choice.PAPER;
		}
	}

	@Test
	public void roundPerformationTest() {
		Player paperPlayer = new PaperPlayer();
		Player rockPlayer = new RockPlayer();
		Player scissorsPlayer = new ScissorsPlayer();
		Player[] playerArr = new Player[3];
		playerArr[0] = paperPlayer;
		playerArr[1] = rockPlayer;
		playerArr[2] = scissorsPlayer;
		Map<Integer, String> resultDescription = new HashMap<Integer, String>();
		resultDescription.put(1, "win");
		resultDescription.put(-1, "be beaten by");
		resultDescription.put(0, "have tie with");

		int[][] expected = new int[][] { 
			{ 0, 1, -1 }, 
			{ -1, 0, 1 }, 
			{ 1, -1, 0 } 
			};

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				if (expected[i][j] != RoundPerformer.processRound(playerArr[i], playerArr[j])) {
					fail(playerArr[i].getClass().getSimpleName() + " should " + resultDescription.get(expected[i][j])
							+ "  " + playerArr[j].getClass().getSimpleName());
				}
			}

	}

}
