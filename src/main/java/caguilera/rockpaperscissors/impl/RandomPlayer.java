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

	private final Random generator;

	/**
	 * Used only for testing purposes
	 */
	protected RandomPlayer(long seed) {
		this.generator = new Random(seed);
	}

	public RandomPlayer() {
		this.generator = new Random(System.currentTimeMillis());
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
}
