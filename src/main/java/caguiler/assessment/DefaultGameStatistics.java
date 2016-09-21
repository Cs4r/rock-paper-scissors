package caguiler.assessment;

import java.util.List;

/**
 * Default implementation of {@link GameStatistics}
 *
 * @param <T>
 *            any {@link Game}
 */
public class DefaultGameStatistics<T extends Game> implements GameStatistics<T> {

	@Override
	public List<Player<T>> getPlayers() {
		return null;
	}

	@Override
	public int getNumberOfGameRounds() {
		return 0;
	}

	@Override
	public int getNumberOfWins(Player<T> p) {
		return 0;
	}

	@Override
	public int getNumberOfLosses(Player<T> p) {
		return 0;
	}

	@Override
	public int getNumberOfTies(Player<T> p) {
		return 0;
	}

}
