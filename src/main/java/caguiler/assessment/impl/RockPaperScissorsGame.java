package caguiler.assessment.impl;

import static caguiler.assessment.GameRoundResult.LOSS;
import static caguiler.assessment.GameRoundResult.TIE;
import static caguiler.assessment.GameRoundResult.WIN;

import caguiler.assessment.Game;
import caguiler.assessment.GameRole;
import caguiler.assessment.GameRoundResult;

/**
 * The rock, paper, scissors game (Our game)
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 *
 */
public class RockPaperScissorsGame implements Game {

	private RockPaperScissorsGame() {
	}

	public static final GameRole<RockPaperScissorsGame> ROCK = new GameRole<RockPaperScissorsGame>() {
		@Override
		public GameRoundResult canBeat(GameRole<RockPaperScissorsGame> other) {
			throwIllegalArgumentExceptionIfNullIsPassed(other);
			if(other == SCISSORS) return WIN;
			if(this == other) return TIE;
			return LOSS;
		}
	};

	public static final GameRole<RockPaperScissorsGame> PAPER = new GameRole<RockPaperScissorsGame>() {
		@Override
		public GameRoundResult canBeat(GameRole<RockPaperScissorsGame> other) {
			throwIllegalArgumentExceptionIfNullIsPassed(other);
			if(other == ROCK) return WIN;
			if(this == other) return TIE;
			return LOSS;
		}
	};

	public static final GameRole<RockPaperScissorsGame> SCISSORS = new GameRole<RockPaperScissorsGame>() {
		@Override
		public GameRoundResult canBeat(GameRole<RockPaperScissorsGame> other) {
			throwIllegalArgumentExceptionIfNullIsPassed(other);
			if(other == PAPER) return WIN;
			if(this == other) return TIE;
			return LOSS;
		}
	};

	private static void throwIllegalArgumentExceptionIfNullIsPassed(GameRole<RockPaperScissorsGame> other) {
		if (other == null) {
			throw new IllegalArgumentException();
		}
	}
}
