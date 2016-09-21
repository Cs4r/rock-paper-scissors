package caguiler.assessment.impl;

import static caguiler.assessment.impl.RockPaperScissorsGame.ROCK;

import caguiler.assessment.GameRole;
import caguiler.assessment.Player;

/**
 * A player of {@link RockPaperScissorsGame} whose {@link GameRole} is always
 * {@link RockPaperScissorsGame#ROCK}
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 *
 */
public class RockyPlayer implements Player<RockPaperScissorsGame> {

	private final int id;

	private RockyPlayer(int id) {
		this.id = id;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public GameRole<RockPaperScissorsGame> getRole() {
		return ROCK;
	}

	/**
	 * Creates instances of {@link RockyPlayer}
	 * 
	 * @param id
	 *            the player's id
	 * @return a new instance of {@link RockyPlayer} with the given id
	 * 
	 * @throws IllegalArgumentException
	 *             if the given id is not positive
	 */
	public static RockyPlayer of(int id) {
		if (id < 1) {
			throw new IllegalArgumentException();
		}
		return new RockyPlayer(id);
	}

}
