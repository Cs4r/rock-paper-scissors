package caguiler.assessment.impl;

import static caguiler.assessment.GameRoundResult.LOSS;
import static caguiler.assessment.GameRoundResult.TIE;
import static caguiler.assessment.GameRoundResult.WIN;
import static caguiler.assessment.impl.RockPaperScissors.PAPER;
import static caguiler.assessment.impl.RockPaperScissors.ROCK;
import static caguiler.assessment.impl.RockPaperScissors.SCISSORS;
import static org.junit.Assert.*;

import org.junit.Test;

import caguiler.assessment.impl.RockPaperScissors;

/**
 * Unit tests for {@link RockPaperScissors}
 * 
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 *
 */
public class RockPaperScissorsTest {

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
