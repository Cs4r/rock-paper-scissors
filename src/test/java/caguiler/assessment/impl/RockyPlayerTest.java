package caguiler.assessment.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import org.junit.Test;

/**
 * Unit tests for {@link RockyPlayer}
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 *
 */
public class RockyPlayerTest {

	@Test(expected = IllegalArgumentException.class)
	public void ofThrowsIllegalArgumentExceptionWhenANegativeIdIsGiven() {
		RockyPlayer.of(-1);
	}

	@Test
	public void ofCreatesANotNullRockyPlayerWhenIdIsPositive() {
		assertNotNull(RockyPlayer.of(1));
	}

	@Test
	public void ofCreatesAPlayerWithTheGivenId() {
		int expected = 1;
		RockyPlayer player = RockyPlayer.of(expected);
		assertEquals(expected, player.getId());
	}

	@Test(expected = IllegalArgumentException.class)
	public void getRoleThrowsIllegalArgumentExceptionWhenRoundIsNull() {
		RockyPlayer.of(1).getRole(null);
	}

	@Test
	public void getRoleAlwaysReturnsRockAsGameRole() {
		RockyPlayer player = RockyPlayer.of(1);
		RockPaperScissorsRound round = mock(RockPaperScissorsRound.class);
		for (int i = 0; i < 10; ++i) {
			assertEquals(RockPaperScissorsGame.ROCK, player.getRole(round));
		}
	}
}
