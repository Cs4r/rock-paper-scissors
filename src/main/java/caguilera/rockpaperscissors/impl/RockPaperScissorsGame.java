package caguilera.rockpaperscissors.impl;

import static caguilera.rockpaperscissors.GameRoundResult.LOSS;
import static caguilera.rockpaperscissors.GameRoundResult.TIE;
import static caguilera.rockpaperscissors.GameRoundResult.WIN;

import caguilera.rockpaperscissors.Game;
import caguilera.rockpaperscissors.GameRole;
import caguilera.rockpaperscissors.GameRoundResult;

/**
 * The rock, paper, scissors game
 * 
 * @author Cesar Aguilera
 *
 */
public class RockPaperScissorsGame implements Game {

	private RockPaperScissorsGame() {
		// Cannot be instantiated
	}

	public static final GameRole<RockPaperScissorsGame> ROCK = new GameRole<RockPaperScissorsGame>() {
		@Override
		public GameRoundResult canBeat(GameRole<RockPaperScissorsGame> other) {
			throwIllegalArgumentExceptionIfNullIsPassed(other);
			if (other == SCISSORS)
				return WIN;
			if (this == other)
				return TIE;
			return LOSS;
		}
	};

	public static final GameRole<RockPaperScissorsGame> PAPER = new GameRole<RockPaperScissorsGame>() {
		@Override
		public GameRoundResult canBeat(GameRole<RockPaperScissorsGame> other) {
			throwIllegalArgumentExceptionIfNullIsPassed(other);
			if (other == ROCK)
				return WIN;
			if (this == other)
				return TIE;
			return LOSS;
		}
	};

	public static final GameRole<RockPaperScissorsGame> SCISSORS = new GameRole<RockPaperScissorsGame>() {
		@Override
		public GameRoundResult canBeat(GameRole<RockPaperScissorsGame> other) {
			throwIllegalArgumentExceptionIfNullIsPassed(other);
			if (other == PAPER)
				return WIN;
			if (this == other)
				return TIE;
			return LOSS;
		}
	};

	private static void throwIllegalArgumentExceptionIfNullIsPassed(GameRole<RockPaperScissorsGame> other) {
		if (other == null) {
			throw new IllegalArgumentException();
		}
	}
}
