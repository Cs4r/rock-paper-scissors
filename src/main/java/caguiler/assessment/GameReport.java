package caguiler.assessment;

/**
 * Registers the result of several {@link GameRound} between two {@link Player}s
 * in order to provide {@link GameStatistics}
 * 
 * @param <T>
 *            any {@link Game}
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 */
public interface GameReport<T extends Game> {

	/**
	 * Registers the result of a {@link GameRound} between two players
	 * 
	 * @param round
	 *            the {@link GameRound}
	 * @param player1
	 *            first player
	 * @param player2
	 *            second player
	 */
	void registerResult(GameRoundResult round, Player<T> player1, Player<T> player2);

	/**
	 * @return {@link GameStatistics} for a sequence of played rounds
	 */
	GameStatistics<T> getStatistics();
}
