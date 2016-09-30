package caguilera.rockpaperscissors;

/**
 * The round of a game
 * 
 * @author Cesar Aguilera
 * 
 * @param <T>
 *            any {@link Game}
 *
 */
public interface GameRound<T extends Game> {

	/**
	 * @return A positive number representing the round's identifier.
	 */
	int getId();
}
