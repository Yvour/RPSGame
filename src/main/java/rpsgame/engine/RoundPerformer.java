package rpsgame.engine;

import rpsgame.player.Player;

public class RoundPerformer {
	public static int processRound(Player a, Player b) {
		return ChoiceComparator.processChoices(a.makeChoice(), b.makeChoice());
	}
}
