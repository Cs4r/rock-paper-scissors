package caguiler.assessment;

import static caguiler.assessment.RockPaperScissors.PAPER;
import static caguiler.assessment.RockPaperScissors.SCISSORS;
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
	public void ScissorsBeatsPaper() {
		assertTrue(SCISSORS.canBeat(PAPER));
	}

}