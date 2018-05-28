package rpsgame.engine;

public class GameResult {

	private final int playerAVictoryCount;
	private final int playerBVictoryCount;
	private final int tieCount;

	public GameResult(int playerAVictoryCount, int playerBVictoryCount, int tieCount) {
		super();
		this.playerAVictoryCount = playerAVictoryCount;
		this.playerBVictoryCount = playerBVictoryCount;
		this.tieCount = tieCount;
	}

	public int getPlayerAVictoryCount() {
		return playerAVictoryCount;
	}

	public int getPlayerBVictoryCount() {
		return playerBVictoryCount;
	}

	public int getTieCount() {
		return tieCount;
	}

	public int getRoundCount() {
		return tieCount + playerAVictoryCount + playerBVictoryCount;
	}

}
