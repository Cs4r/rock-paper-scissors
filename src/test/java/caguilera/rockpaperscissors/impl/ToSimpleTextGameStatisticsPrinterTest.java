package caguilera.rockpaperscissors.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import caguilera.rockpaperscissors.GameStatistics;

/**
 * Unit tests for {@link ToSimpleTextGameStatisticsPrinter}
 * 
 * @author Cesar Aguilera
 *
 */
public class ToSimpleTextGameStatisticsPrinterTest {

	@Test(expected = IllegalArgumentException.class)
	public void testOfThrowsIllegalArgumentExceptionIfNullStatisticsAreGiven() {
		ToSimpleTextGameStatisticsPrinter.of(null);
	}

	@Test
	public void testPrintReturnsWellFormedString() {
		@SuppressWarnings("unchecked")
		GameStatistics<TestGame> statistics = mock(GameStatistics.class);

		int player1Wins = 20;
		int player1Losses = 10;
		int player1Ties = 30;
		int player2Wins = 40;
		int player2Losses = 50;
		int player2Ties = 60;
		int rounds = 70;

		when(statistics.getFirstPlayerWins()).thenReturn(player1Wins);
		when(statistics.getFirstPlayerLosses()).thenReturn(player1Losses);
		when(statistics.getFirstPlayerTies()).thenReturn(player1Ties);

		when(statistics.getSecondPlayerWins()).thenReturn(player2Wins);
		when(statistics.getSecondPlayerLosses()).thenReturn(player2Losses);
		when(statistics.getSecondPlayerTies()).thenReturn(player2Ties);

		when(statistics.getNumberOfGameRounds()).thenReturn(rounds);

		ToSimpleTextGameStatisticsPrinter<TestGame> printer = ToSimpleTextGameStatisticsPrinter.of(statistics);

		String expectedOutput = "Player 1: Won " + player1Wins + ", lost " + player1Losses + " and tied " + player1Ties
				+ " times\n" + "Player 2: Won " + player2Wins + ", lost " + player2Losses + " and tied " + player2Ties
				+ " times\n" + "Total rounds: " + rounds + "\n";

		assertEquals(expectedOutput, printer.print());
	}

}
