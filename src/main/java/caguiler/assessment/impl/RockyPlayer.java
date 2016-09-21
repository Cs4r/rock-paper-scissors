package caguiler.assessment.impl;

import static caguiler.assessment.impl.RockPaperScissors.ROCK;

import caguiler.assessment.GameRole;
import caguiler.assessment.Player;

/**
 * A player of {@link RockPaperScissors} whose {@link GameRole} is always
 * {@link RockPaperScissors#ROCK}
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 *
 */
public class RockyPlayer implements Player<RockPaperScissors> {

	private final int id;

	private RockyPlayer(int id) {
		this.id = id;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public GameRole<RockPaperScissors> getRole() {
		return ROCK;
	}

	/**
	 * Creates instances of {@link RockyPlayer}
	 * 
	 * @param id
	 *            the player's id
	 * @return a new instance of {@link RockyPlayer} with the given id
	 */
	public static RockyPlayer of(int id) {
		if (id < 1) {
			throw new IllegalArgumentException();
		}
		return new RockyPlayer(id);
	}

}
