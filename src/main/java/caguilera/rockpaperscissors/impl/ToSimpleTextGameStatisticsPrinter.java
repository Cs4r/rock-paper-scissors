package caguilera.rockpaperscissors.impl;

import caguilera.rockpaperscissors.Game;
import caguilera.rockpaperscissors.GameStatistics;
import caguilera.rockpaperscissors.GameStatisticsPrinter;

/**
 * Transforms a {@link GameStatistics} object into its simplest String
 * representation
 * 
 * @author Cesar Aguilera
 * @param <T>
 *            any {@link Game}
 * 
 */
class ToSimpleTextGameStatisticsPrinter<T extends Game> implements GameStatisticsPrinter<T> {

	private final String summary;

	private ToSimpleTextGameStatisticsPrinter(GameStatistics<T> statistics) {
		StringBuilder template = new StringBuilder();
		int player1Losses = statistics.getFirstPlayerLosses();
		int player1Wins = statistics.getFirstPlayerWins();
		int player1Ties = statistics.getFirstPlayerTies();
		int player2Wins = statistics.getSecondPlayerWins();
		int player2Losses = statistics.getSecondPlayerLosses();
		int player2Ties = statistics.getSecondPlayerTies();
		int rounds = statistics.getNumberOfGameRounds();

		template.append("Player 1: Won ").append(player1Wins).append(", lost ").append(player1Losses)
				.append(" and tied ").append(player1Ties).append(" times\n");

		template.append("Player 2: Won ").append(player2Wins).append(", lost ").append(player2Losses)
				.append(" and tied ").append(player2Ties).append(" times\n");

		template.append("Total rounds: ").append(rounds).append("\n");

		summary = template.toString();
	}

	@Override
	public String print() {
		return summary;
	}

	public static <T extends Game> ToSimpleTextGameStatisticsPrinter<T> of(GameStatistics<T> statistics) {
		if (statistics == null) {
			throw new IllegalArgumentException();
		}
		return new ToSimpleTextGameStatisticsPrinter<>(statistics);
	}

}
