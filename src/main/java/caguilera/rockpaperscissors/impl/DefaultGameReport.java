package caguilera.rockpaperscissors.impl;

import caguilera.rockpaperscissors.Game;
import caguilera.rockpaperscissors.GameReport;
import caguilera.rockpaperscissors.GameRoundResult;
import caguilera.rockpaperscissors.GameStatistics;
import caguilera.rockpaperscissors.Player;

/**
 * Default and naive implementation of {@link GameReport}
 * 
 * @author Cesar Aguilera
 *
 * @param <T>
 *            any {@link Game}
 */
public class DefaultGameReport<T extends Game> implements GameReport<T> {

	private int player1Wins;
	private int player1Losses;
	private int ties;

	@Override
	public void registerResult(GameRoundResult result, Player<T> player1, Player<T> player2) {
		throwIfAnyIsNull(result, player1, player2);

		if (result == GameRoundResult.WIN) {
			++player1Wins;
		} else if (result == GameRoundResult.LOSS) {
			++player1Losses;
		} else {
			++ties;
		}
	}

	@Override
	public GameStatistics<T> getStatistics() {
		return new DefaultGameStatistics<>(player1Wins, player1Losses, ties);
	}

	private void throwIfAnyIsNull(Object... params) {
		for (int i = 0; i < params.length; i++) {
			if (params[i] == null) {
				throw new IllegalArgumentException();
			}
		}
	}
}
