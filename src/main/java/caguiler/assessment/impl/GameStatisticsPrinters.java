package caguiler.assessment.impl;

import caguiler.assessment.GameStatistics;
import caguiler.assessment.GameStatisticsPrinter;

public class GameStatisticsPrinters {

	public static GameStatisticsPrinter<RockPaperScissorsGame> toText(
			GameStatistics<RockPaperScissorsGame> statistics) {
		return ToSimpleTextGameStatisticsPrinter.of(statistics);
	}
}
