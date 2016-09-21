package caguiler.assessment.impl;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit testing for {@link RockPaperScissorsRound}
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 *
 */
public class RockPaperScissorsRoundTest {

	@Test(expected = IllegalArgumentException.class)
	public void fromIdThrowsIllegalArgumentExceptionWhenANegativeIdIsGiven() {
		RockPaperScissorsRound.fromId(-1);
	}

	@Test
	public void ofCreatesANotNullRoundWhenIdIsPositive() {
		assertNotNull(RockPaperScissorsRound.fromId(1));
	}

	@Test
	public void ofCreatesARoundWithTheGivenId() {
		int expected = 1;
		RockPaperScissorsRound round = RockPaperScissorsRound.fromId(expected);
		assertEquals(expected, round.getId());
	}
}
