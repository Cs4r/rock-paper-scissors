package caguiler.assessment;

/**
 * A player of a {@link Game}
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 *
 * @param <T>
 *            Game played by the Player
 */
public interface Player<T extends Game> {

	/**
	 * @return A positive number representing the player's identifier.
	 */
	int getId();

	/**
	 * @return {@link GameRole} taken during a game round
	 */
	GameRole<T> getRole();
}
