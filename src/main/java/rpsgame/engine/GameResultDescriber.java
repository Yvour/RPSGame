package rpsgame.engine;

public class GameResultDescriber {
	private static String getVictoryDescription(String player, int victoryCount, int total) {
		return "Player " + player + " wins " + victoryCount + " of " + total + " games";
	}

	private static String getTieDescription(int tieCount, int total) {
		return "Tie: " + tieCount + " of " + total + " games";
	}

	public static String describe(GameResult result) {
		return getVictoryDescription("A", result.getPlayerAVictoryCount(), result.getRoundCount()) + "\n"
				+ getVictoryDescription("B", result.getPlayerBVictoryCount(), result.getRoundCount()) + "\n"
				+ getTieDescription(result.getTieCount(), result.getRoundCount());
	}

}
