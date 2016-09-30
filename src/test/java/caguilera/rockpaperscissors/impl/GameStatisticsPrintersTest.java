package caguilera.rockpaperscissors.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;

import caguilera.rockpaperscissors.GameStatistics;
import caguilera.rockpaperscissors.GameStatisticsPrinter;

/**
 * Unit tests for {@link GameStatisticsPrinters}
 * 
 * @author Cesar Aguilera
 *
 */
public class GameStatisticsPrintersTest {

	@Test(expected = IllegalArgumentException.class)
	public void testToTextWhenNullGameStatisticsAreGiven() {
		GameStatisticsPrinters.toText(null);
	}

	@Test
	public void testToText() {
		@SuppressWarnings("unchecked")
		GameStatistics<TestGame> statistics = mock(GameStatistics.class);
		GameStatisticsPrinter<TestGame> printer = GameStatisticsPrinters.toText(statistics);

		assertNotNull(printer);
		assertTrue(printer instanceof ToSimpleTextGameStatisticsPrinter);
	}

}
