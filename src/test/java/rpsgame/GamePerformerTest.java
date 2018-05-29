package rpsgame;

import static org.junit.Assert.fail;

import java.util.Random;

import org.junit.Test;

import rpsgame.engine.GamePerformer;
import rpsgame.engine.GameResult;
import rpsgame.player.PlayerB;

public class GamePerformerTest {

	private final static int PERFORM_COUNT = 100;
	private final static Random RANDOM = new Random();

	@Test
	public void gamePerformingTest() {
		for (int i = 0; i < PERFORM_COUNT; i++) {

			int roundCount = RANDOM.nextInt(1000) + 100;

			GameResult result = GamePerformer.performGame(new PlayerB(), new PlayerB(), roundCount);
			if (result.getPlayerAVictoryCount() + result.getPlayerBVictoryCount()
					+ result.getTieCount() != roundCount) {
				fail("Gamer performer does not perform requested round count");
			}
		}

		assert (true);
	}
}
