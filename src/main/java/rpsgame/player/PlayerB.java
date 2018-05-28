package rpsgame.player;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import rpsgame.engine.Choice;

public class PlayerB implements Player {
	private static final List<Choice> CHOICES = Arrays.asList(Choice.values());
	private static final Random RANDOM = new Random();

	public Choice makeChoice() {
		return CHOICES.get(RANDOM.nextInt(CHOICES.size()));

	}
}
