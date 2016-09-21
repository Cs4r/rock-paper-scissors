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
public class RockPaperScissors implements Game {

	private RockPaperScissors() {
	}

	public static final GameRole<RockPaperScissors> ROCK = new GameRole<RockPaperScissors>() {
		@Override
		public GameRoundResult canBeat(GameRole<RockPaperScissors> other) {
			throwIllegalArgumentExceptionIfNullIsPassed(other);
			if(other == SCISSORS) return WIN;
			if(this == other) return TIE;
			return LOSS;
		}
	};

	public static final GameRole<RockPaperScissors> PAPER = new GameRole<RockPaperScissors>() {
		@Override
		public GameRoundResult canBeat(GameRole<RockPaperScissors> other) {
			throwIllegalArgumentExceptionIfNullIsPassed(other);
			if(other == ROCK) return WIN;
			if(this == other) return TIE;
			return LOSS;
		}
	};

	public static final GameRole<RockPaperScissors> SCISSORS = new GameRole<RockPaperScissors>() {
		@Override
		public GameRoundResult canBeat(GameRole<RockPaperScissors> other) {
			throwIllegalArgumentExceptionIfNullIsPassed(other);
			if(other == PAPER) return WIN;
			if(this == other) return TIE;
			return LOSS;
		}
	};

	private static void throwIllegalArgumentExceptionIfNullIsPassed(GameRole<RockPaperScissors> other) {
		if (other == null) {
			throw new IllegalArgumentException();
		}
	}
}
