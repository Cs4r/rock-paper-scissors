package caguilera.rockpaperscissors;

/**
 * Registers the result of several {@link GameRound} between two {@link Player}s
 * in order to provide {@link GameStatistics}
 * 
 * @param <T>
 *            any {@link Game}
 * @author Cesar Aguilera
 */
public interface GameReport<T extends Game> {

	/**
	 * Registers the result of a {@link GameRound} between two players. The
	 * result is dependent of main's player perspective.
	 * 
	 * @param result
	 *            the {@link GameRound}
	 * @param player1
	 *            first player
	 * @param player2
	 *            second player
	 */
	void registerResult(GameRoundResult result, Player<T> player1, Player<T> player2);

	/**
	 * @return {@link GameStatistics} for a sequence of played rounds
	 */
	GameStatistics<T> getStatistics();
}
