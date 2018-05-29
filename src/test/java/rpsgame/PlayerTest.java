package rpsgame;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import rpsgame.engine.Choice;
import rpsgame.player.Player;
import rpsgame.player.PlayerA;
import rpsgame.player.PlayerB;

public class PlayerTest {
	private static final int PLAYER_CHOICE_COUNT = 1000;

	@Test
	public void playerATest() {
		Player playerA = new PlayerA();
		for (int i = 0; i < PLAYER_CHOICE_COUNT; i++) {
			if (!playerA.makeChoice().equals(Choice.PAPER)) {
				fail("Player A does not always choose paper");
			}
		}
		assert (true);
	}

	@Test
	public void playerBTest() {
		Player playerB = new PlayerB();
		Map<Choice, Integer> choiceCounts = new HashMap<Choice, Integer>();
		choiceCounts.put(Choice.PAPER, 0);
		choiceCounts.put(Choice.ROCK, 0);
		choiceCounts.put(Choice.SCISSORS, 0);
		for (int i = 0; i < PLAYER_CHOICE_COUNT; i++) {
			Choice choice = playerB.makeChoice();
			choiceCounts.put(choice, choiceCounts.get(choice) + 1);
		}
		if (choiceCounts.values().contains(0)) {
			fail("Player B does not choose randomly");
		}
		assert (true);
	}

}
