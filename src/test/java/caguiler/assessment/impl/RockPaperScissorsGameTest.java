package caguiler.assessment.impl;

import static caguiler.assessment.GameRoundResult.LOSS;
import static caguiler.assessment.GameRoundResult.TIE;
import static caguiler.assessment.GameRoundResult.WIN;
import static caguiler.assessment.impl.RockPaperScissorsGame.PAPER;
import static caguiler.assessment.impl.RockPaperScissorsGame.ROCK;
import static caguiler.assessment.impl.RockPaperScissorsGame.SCISSORS;
import static org.junit.Assert.*;

import org.junit.Test;

import caguiler.assessment.impl.RockPaperScissorsGame;

/**
 * Unit tests for {@link RockPaperScissorsGame}
 * 
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 *
 */
public class RockPaperScissorsGameTest {

	@Test
	public void scissorsBeatsPaper() {
		assertEquals(WIN, SCISSORS.canBeat(PAPER));
	}

	@Test
	public void paperBeatsRock() {
		assertEquals(WIN, PAPER.canBeat(ROCK));
	}

	@Test
	public void rockBeatsScissors() {
		assertEquals(WIN, ROCK.canBeat(SCISSORS));
	}

	@Test
	public void scissorsCannotBeatRock() {
		assertEquals(LOSS, SCISSORS.canBeat(ROCK));
	}

	@Test
	public void paperCannotBeatScissors() {
		assertEquals(LOSS, PAPER.canBeat(SCISSORS));
	}

	@Test
	public void rockCannotBeatPaper() {
		assertEquals(LOSS, ROCK.canBeat(PAPER));
	}

	@Test
	public void rockEndsUpInATieAgainstItself() {
		assertEquals(TIE, ROCK.canBeat(ROCK));
	}

	@Test
	public void paperEndsUpInATieAgainstItself() {
		assertEquals(TIE, PAPER.canBeat(PAPER));
	}

	@Test
	public void scissorsEndsUpInATieAgainstItself() {
		assertEquals(TIE, SCISSORS.canBeat(SCISSORS));
	}

	@Test(expected = IllegalArgumentException.class)
	public void rock_canBeatThrowsIllegalArgumentExceptionWhenNullIsPassed() {
		ROCK.canBeat(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void paper_canBeatThrowsIllegalArgumentExceptionWhenNullIsPassed() {
		PAPER.canBeat(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void scissors_canBeatThrowsIllegalArgumentExceptionWhenNullIsPassed() {
		SCISSORS.canBeat(null);
	}

}
