package caguiler.assessment.impl;

import static caguiler.assessment.GameRoundResult.LOSS;
import static caguiler.assessment.GameRoundResult.TIE;
import static caguiler.assessment.GameRoundResult.WIN;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

import caguiler.assessment.GameReport;
import caguiler.assessment.GameRoundResult;
import caguiler.assessment.GameStatistics;
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

	@Test
	public void testGetStatisticsWhenNotResultsAreRegistered() {
		GameStatistics<TestGame> statistics = gameReport.getStatistics();

		final int ZERO = 0;
		assertEquals(ZERO, statistics.getFirstPlayerWins());
		assertEquals(ZERO, statistics.getSecondPlayerLosses());

		assertEquals(ZERO, statistics.getFirstPlayerLosses());
		assertEquals(ZERO, statistics.getSecondPlayerWins());

		assertEquals(ZERO, statistics.getFirstPlayerTies());
		assertEquals(ZERO, statistics.getFirstPlayerTies());

		assertEquals(ZERO, statistics.getNumberOfGameRounds());
	}

	@Test
	public void testGetStatistics() {
		final int PLAYER_1_WINS = 3;
		final int TIES = 3;
		final int PLAYER_2_WINS = 2;
		final int TOTAL_ROUNDS = PLAYER_1_WINS + PLAYER_2_WINS + TIES;

		for (int i = 0; i < PLAYER_1_WINS; ++i) {
			gameReport.registerResult(WIN, player1, player2);
		}

		for (int i = 0; i < PLAYER_2_WINS; ++i) {
			gameReport.registerResult(LOSS, player1, player2);
		}

		for (int i = 0; i < TIES; ++i) {
			gameReport.registerResult(TIE, player1, player2);
		}
		
		GameStatistics<TestGame> statistics = gameReport.getStatistics();

		assertEquals(PLAYER_1_WINS, statistics.getFirstPlayerWins());
		assertEquals(PLAYER_1_WINS, statistics.getSecondPlayerLosses());

		assertEquals(PLAYER_2_WINS, statistics.getFirstPlayerLosses());
		assertEquals(PLAYER_2_WINS, statistics.getSecondPlayerWins());

		assertEquals(TIES, statistics.getFirstPlayerTies());
		assertEquals(TIES, statistics.getFirstPlayerTies());

		assertEquals(TOTAL_ROUNDS, statistics.getNumberOfGameRounds());
	}
}
