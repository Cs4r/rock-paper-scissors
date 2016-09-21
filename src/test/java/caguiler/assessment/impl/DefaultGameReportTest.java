package caguiler.assessment.impl;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

import caguiler.assessment.Game;
import caguiler.assessment.GameReport;
import caguiler.assessment.GameRoundResult;
import caguiler.assessment.Player;

/**
 * Unit tests for {@link DefaultGameReport}
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 *
 */
public class DefaultGameReportTest {

	private GameReport<TestGame> gameReport;
	private Player<TestGame> player1;
	private Player<TestGame> player2;
	private GameRoundResult roundResult;

	@SuppressWarnings("unchecked")
	@Before
	public void setUp() {
		gameReport = new DefaultGameReport<>();
		player1 = (Player<TestGame>) mock(Player.class);
		player2 = (Player<TestGame>) mock(Player.class);
		roundResult = GameRoundResult.WIN;
	}

	@Test(expected = IllegalArgumentException.class)
	public void playRoundResultThrowsIllegalArgumentIfRoundResultIsNull() {
		gameReport.registerResult(null, player1, player2);
	}

	@Test(expected = IllegalArgumentException.class)
	public void playRoundThrowsIllegalArgumentIfPlayer1IsNull() {
		gameReport.registerResult(roundResult, null, player2);
	}

	@Test(expected = IllegalArgumentException.class)
	public void playRoundThrowsIllegalArgumentIfPlayer2IsNull() {
		gameReport.registerResult(roundResult, player1, null);
	}

	@Test
	public void testGetStatisticsReturnsANotNullObject() {
		gameReport.registerResult(roundResult, player1, player2);

		assertNotNull(gameReport.getStatistics());
	}

	interface TestGame extends Game {
	}

}
