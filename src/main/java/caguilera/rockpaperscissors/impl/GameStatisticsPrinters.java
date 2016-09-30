package caguilera.rockpaperscissors.impl;

import caguilera.rockpaperscissors.Game;
import caguilera.rockpaperscissors.GameStatistics;
import caguilera.rockpaperscissors.GameStatisticsPrinter;

/**
 * Keeps a registry of all possible {@link GameStatisticsPrinter}s
 * 
 * @author Cesar Aguilera
 */
public class GameStatisticsPrinters {

	public static <T extends Game> GameStatisticsPrinter<T> toText(
			GameStatistics<T> statistics) {
		return ToSimpleTextGameStatisticsPrinter.of(statistics);
	}
}
