package caguiler.assessment;

/**
 * A player of a game
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 *
 * @param <T>
 *            Game played by the Player
 */
public interface Player<T extends Game> {

	/**
	 * @return Player's identifier
	 */
	int getId();

	/**
	 * @return {@link GameRole} taken during a game round
	 */
	GameRole<Game> role();
}
