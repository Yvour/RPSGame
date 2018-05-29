package rpsgame;

import static org.junit.Assert.fail;

import java.util.Random;

import org.junit.Test;

import rpsgame.engine.GameResult;
import rpsgame.engine.GameResultDescriber;

public class GameResultDescriberTest {
	
	private static int COUNT = 100;
	private static Random RANDOM = new Random();
	private static int MAX_RESULT_COUNT = 1000;

	@Test
	public void gameResultDescriptionTest() {
		
		for (int i = 0; i < COUNT; i++) {
			int aVictoryCount = RANDOM.nextInt(MAX_RESULT_COUNT);
			int bVictoryCount = RANDOM.nextInt(MAX_RESULT_COUNT);
			int tieCount = RANDOM.nextInt(MAX_RESULT_COUNT);
			GameResult result = new GameResult(
					aVictoryCount,
					bVictoryCount,
					tieCount);
			String descr = GameResultDescriber.describe(result);
			if (!descr.contains(" " + String.valueOf(aVictoryCount)+" ")) {
				fail("Result description does not contain PlayerA victories count");
			}
			
			if (!descr.contains(" " + String.valueOf(bVictoryCount)+ " ")) {
				fail("Result description does not contain PlayerB victories count");
			}
			
			if (!descr.contains(" " + String.valueOf(tieCount)+ " ")) {
				fail("Result description does not contain tie result count");
			}
			
			if (!descr.contains(" " + String.valueOf(tieCount + aVictoryCount + bVictoryCount)+ " ")) {
				fail("Result description does not contain rounds number");
			}
			
		}
		
		assert (true);
	}

}
