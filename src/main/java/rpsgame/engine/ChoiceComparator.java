package rpsgame.engine;

import java.util.Arrays;
import java.util.List;

// Maybe Choice is to be set comparable, but it is not fact
public class ChoiceComparator {
	// returns 1 if first choice wins, -1 if seconds, 0 in case of tie
	private static final List<Choice> CHOICES = Arrays.asList(Choice.values());

	public static int processChoices(Choice first, Choice second) {

		if (first.getBeaten() == second)
			return 1;
		if (first.getWinner() == second)
			return -1;
		return 0;

	}
}
