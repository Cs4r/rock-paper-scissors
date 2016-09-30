package caguilera.rockpaperscissors.impl;

import static caguilera.rockpaperscissors.impl.RockPaperScissorsGame.PAPER;
import static caguilera.rockpaperscissors.impl.RockPaperScissorsGame.ROCK;
import static caguilera.rockpaperscissors.impl.RockPaperScissorsGame.SCISSORS;

import java.util.Random;

import caguilera.rockpaperscissors.GameRole;
import caguilera.rockpaperscissors.GameRound;
import caguilera.rockpaperscissors.Player;

/**
 * A player of {@link RockPaperScissorsGame} whose {@link GameRole} is randomly
 * chosen depending on the {@link RockPaperScissorsRound}
 * 
 * @author Cesar Aguilera
 *
 */
public class RandomPlayer implements Player<RockPaperScissorsGame> {

	private final int id;
	private final Random generator;

	/**
	 * Used only for testing purposes
	 */
	protected RandomPlayer(int id, long seed) {
		this.id = id;
		this.generator = new Random(seed);
	}

	private RandomPlayer(int id) {
		this.id = id;
		this.generator = new Random(System.currentTimeMillis());
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
		// I am not using the parameter GameRound here, but it could be used to
		// reproduce the decisions made by a player in past rounds
		int randomNumber = generator.nextInt(3) + 1;
		if (randomNumber == 1) {
			return ROCK;
		}
		if (randomNumber == 2) {
			return PAPER;
		}

		return SCISSORS;
	}

	/**
	 * Creates instances of {@link RandomPlayer}
	 * 
	 * @param id
	 *            the player's id
	 * @return a new instance of {@link RandomPlayer} with the given id
	 * 
	 * @throws IllegalArgumentException
	 *             if the given id is not positive
	 */
	public static RandomPlayer of(int id) {
		if (id < 1) {
			throw new IllegalArgumentException();
		}
		return new RandomPlayer(id);
	}

}
