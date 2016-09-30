package caguilera.rockpaperscissors.impl;

import static caguilera.rockpaperscissors.GameRoundResult.LOSS;
import static caguilera.rockpaperscissors.GameRoundResult.TIE;
import static caguilera.rockpaperscissors.GameRoundResult.WIN;
import static caguilera.rockpaperscissors.impl.RockPaperScissorsGame.PAPER;
import static caguilera.rockpaperscissors.impl.RockPaperScissorsGame.ROCK;
import static caguilera.rockpaperscissors.impl.RockPaperScissorsGame.SCISSORS;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for {@link RockPaperScissorsGame}
 * 
 * 
 * @author Cesar Aguilera
 *
 */
public class RockPaperScissorsGameTest {

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
