package caguiler.assessment;

import static caguiler.assessment.RockPaperScissors.PAPER;
import static caguiler.assessment.RockPaperScissors.SCISSORS;
import static caguiler.assessment.RockPaperScissors.ROCK;
import static org.junit.Assert.assertTrue;

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

	@Test(expected = IllegalArgumentException.class)
	public void rock_canBeatThrowsIllegalArgumentExceptionWhenNullIsPassed() {
		ROCK.canBeat(null);
	}

}
