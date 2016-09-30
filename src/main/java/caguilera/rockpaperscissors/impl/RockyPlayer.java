package caguilera.rockpaperscissors.impl;

import static caguilera.rockpaperscissors.impl.RockPaperScissorsGame.ROCK;

import caguilera.rockpaperscissors.GameRole;
import caguilera.rockpaperscissors.GameRound;
import caguilera.rockpaperscissors.Player;

/**
 * A player of {@link RockPaperScissorsGame} whose {@link GameRole} is always
 * {@link RockPaperScissorsGame#ROCK}
 * 
 * @author Cesar Aguilera
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
	public GameRole<RockPaperScissorsGame> getRole(GameRound<RockPaperScissorsGame> round) {
		if (round == null) {
			throw new IllegalArgumentException();
		}
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
