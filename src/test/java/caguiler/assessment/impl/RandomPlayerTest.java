package caguiler.assessment.impl;

import static caguiler.assessment.impl.RockPaperScissorsGame.PAPER;
import static caguiler.assessment.impl.RockPaperScissorsGame.ROCK;
import static caguiler.assessment.impl.RockPaperScissorsGame.SCISSORS;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import caguiler.assessment.GameRole;

/**
 * Unit tests for {@link RandomPlayer}
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 *
 */
public class RandomPlayerTest {

	@Test(expected = IllegalArgumentException.class)
	public void ofThrowsIllegalArgumentExceptionWhenANegativeIdIsGiven() {
		RandomPlayer.of(-1);
	}

	@Test
	public void ofCreatesANotNullRandomPlayerWhenIdIsPositive() {
		assertNotNull(RandomPlayer.of(1));
	}

	@Test
	public void ofCreatesAPlayerWithTheGivenId() {
		int expected = 1;
		RandomPlayer player = RandomPlayer.of(expected);
		assertEquals(expected, player.getId());
	}

	@Test(expected = IllegalArgumentException.class)
	public void getRoleThrowsIllegalArgumentExceptionWhenRoundIsNull() {
		RandomPlayer.of(1).getRole(null);
	}

	@Test
	public void getRoleReturnsRandomRoleOnEachCall() {
		RandomPlayer player = new RandomPlayer(1, 1);

		List<GameRole<RockPaperScissorsGame>> expectedRole = Arrays.asList(ROCK, PAPER, PAPER, ROCK, SCISSORS, PAPER,
				SCISSORS, PAPER, PAPER);
		RockPaperScissorsRound round = mock(RockPaperScissorsRound.class);

		for (int i = 0; i < 9; ++i) {
			assertEquals(expectedRole.get(i), player.getRole(round));
		}

	}

}
