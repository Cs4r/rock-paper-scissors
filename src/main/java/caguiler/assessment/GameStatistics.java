package caguiler.assessment;

import java.util.List;

/**
 * Contains the statistics of a game played during a sequence of rounds
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 *
 * @param <T>
 *            the game
 */
public interface GameStatistics<T extends Game> {

	/**
	 * @return Players involved in the statistics
	 */
	List<Player<T>> getPlayers();

	/**
	 * @return the number of rounds played
	 */
	int getNumberOfGameRounds();

	/**
	 * @return the number of wins for a given player
	 * @throw {@link IllegalArgumentException} if the player is not involved in
	 *        the statistics
	 */
	int getNumberOfWins(Player<T> p);

	/**
	 * @return the number of losses for a given player
	 * @throw {@link IllegalArgumentException} if the player is not involved in
	 *        the statistics
	 */
	int getNumberOfLosses(Player<T> p);

	/**
	 * @return the number of ties for a given player
	 */
	int getNumberOfTies(Player<T> p);
}
