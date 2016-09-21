package caguiler.assessment.impl;

import caguiler.assessment.Game;
import caguiler.assessment.GameStatistics;
import caguiler.assessment.GameStatisticsPrinter;

/**
 * Keeps a registry of all possible {@link GameStatisticsPrinter}s
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 */
public class GameStatisticsPrinters {

	public static <T extends Game> GameStatisticsPrinter<T> toText(
			GameStatistics<T> statistics) {
		return ToSimpleTextGameStatisticsPrinter.of(statistics);
	}
}
