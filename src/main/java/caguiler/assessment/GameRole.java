package caguiler.assessment;

/**
 * Represents the role that a player can take in a game
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 *
 * @param <T>
 *            Game that contains the role
 */
public interface GameRole<T extends Game> {

	/**
	 * Checks if a {@link GameRole} can beat other {@link GameRole}
	 * 
	 * @param other
	 *            the {@link GameRole} to check
	 * @return {@link GameRoundResult} depending on the game rules
	 */
	GameRoundResult canBeat(GameRole<T> other);
}
