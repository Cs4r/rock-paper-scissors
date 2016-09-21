package caguiler.assessment;

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
		assertTrue(SCISSORS.canBeat(PAPER));
	}

	@Test
	public void paperBeatsRock() {
		assertTrue(PAPER.canBeat(ROCK));
	}

	@Test
	public void rockBeatsScissors() {
		assertTrue(ROCK.canBeat(SCISSORS));
	}

	@Test
	public void scissorsCannotBeatRock() {
		assertFalse(SCISSORS.canBeat(ROCK));
	}

	@Test
	public void paperCannotBeatScissors() {
		assertFalse(PAPER.canBeat(SCISSORS));
	}

	@Test
	public void rockCannotBeatPaper() {
		assertFalse(ROCK.canBeat(PAPER));
	}

	@Test
	public void rockCannotBeatItself() {
		assertFalse(ROCK.canBeat(ROCK));
	}

	@Test
	public void paperCannotBeatItself() {
		assertFalse(PAPER.canBeat(PAPER));
	}

	@Test
	public void scissorsCannotBeatItself() {
		assertFalse(SCISSORS.canBeat(SCISSORS));
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
