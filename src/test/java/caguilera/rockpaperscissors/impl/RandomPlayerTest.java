package caguilera.rockpaperscissors.impl;

import static caguilera.rockpaperscissors.impl.RockPaperScissorsGame.PAPER;
import static caguilera.rockpaperscissors.impl.RockPaperScissorsGame.ROCK;
import static caguilera.rockpaperscissors.impl.RockPaperScissorsGame.SCISSORS;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import caguilera.rockpaperscissors.GameRole;

/**
 * Unit tests for {@link RandomPlayer}
 * 
 * @author Cesar Aguilera
 *
 */
public class RandomPlayerTest {

	@Test(expected = IllegalArgumentException.class)
	public void getRoleThrowsIllegalArgumentExceptionWhenRoundIsNull() {
		new RandomPlayer().getRole(null);
	}

	@Test
	public void getRoleReturnsARandomRoleOnEachCall() {
		int seed = 1;
		// Expected roles of RandomPlayer if seed is set to 1
		List<GameRole<RockPaperScissorsGame>> expectedRole = Arrays.asList(ROCK, PAPER, PAPER, ROCK, SCISSORS, PAPER,
				SCISSORS, PAPER, PAPER);
		RandomPlayer player = new RandomPlayer(seed);
		RockPaperScissorsRound round = mock(RockPaperScissorsRound.class);

		for (int i = 0; i < 9; ++i) {
			assertEquals(expectedRole.get(i), player.getRole(round));
		}

	}

}
