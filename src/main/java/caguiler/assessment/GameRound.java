package caguiler.assessment;

/**
 * The round of a game
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 *
 */
public interface GameRound<T extends Game> {

	/**
	 * @return A positive number representing the round's identifier.
	 */
	int getId();
}
