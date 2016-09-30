package caguilera.rockpaperscissors.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Test;

/**
 * Unit tests for {@link RockyPlayer}
 * 
 * @author Cesar Aguilera
 *
 */
public class RockyPlayerTest {

	@Test(expected = IllegalArgumentException.class)
	public void getRoleThrowsIllegalArgumentExceptionWhenRoundIsNull() {
		new RockyPlayer().getRole(null);
	}

	@Test
	public void getRoleAlwaysReturnsRockAsGameRole() {
		RockyPlayer player = new RockyPlayer();
		RockPaperScissorsRound round = mock(RockPaperScissorsRound.class);
		for (int i = 0; i < 10; ++i) {
			assertEquals(RockPaperScissorsGame.ROCK, player.getRole(round));
		}
	}
}
