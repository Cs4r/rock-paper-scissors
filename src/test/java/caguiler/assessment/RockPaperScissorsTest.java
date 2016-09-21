package caguiler.assessment;

import static caguiler.assessment.GameRoundResult.LOSS;
import static caguiler.assessment.GameRoundResult.TIE;
import static caguiler.assessment.GameRoundResult.WIN;
import static caguiler.assessment.RockPaperScissors.PAPER;
import static caguiler.assessment.RockPaperScissors.SCISSORS;
import static caguiler.assessment.RockPaperScissors.ROCK;
import static org.junit.Assert.*;

import org.junit.Test;

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
	public void rockCannotBeatItself() {
		assertEquals(TIE, ROCK.canBeat(ROCK));
	}

	@Test
	public void paperCannotBeatItself() {
		assertEquals(TIE, PAPER.canBeat(PAPER));
	}

	@Test
	public void scissorsCannotBeatItself() {
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
