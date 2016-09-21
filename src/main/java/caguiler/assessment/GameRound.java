package caguiler.assessment;

/**
 * The round of a game
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
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
