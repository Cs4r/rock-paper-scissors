package caguiler.assessment.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.Test;

import caguiler.assessment.GameStatistics;
import caguiler.assessment.GameStatisticsPrinter;

/**
 * Unit tests for {@link GameStatisticsPrinters}
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
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
