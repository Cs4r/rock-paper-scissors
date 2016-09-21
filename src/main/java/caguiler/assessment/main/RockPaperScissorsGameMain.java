package caguiler.assessment.main;

import caguiler.assessment.GameReport;
import caguiler.assessment.GameStatistics;
import caguiler.assessment.GameStatisticsPrinter;
import caguiler.assessment.Player;
import caguiler.assessment.impl.RandomPlayer;
import caguiler.assessment.impl.RockPaperScissorsGame;
import caguiler.assessment.impl.RockPaperScissorsRound;
import caguiler.assessment.impl.RockyPlayer;

public class RockPaperScissorsGameMain {
	public static final int NUMBER_OF_ROUNDS = 100;

	public static void main(String[] args) {
		final Player<RockPaperScissorsGame> player1 = RandomPlayer.of(1);
		final Player<RockPaperScissorsGame> player2 = RockyPlayer.of(2);
		final GameReport<RockPaperScissorsGame> report = null;

		for (int roundId = 1; roundId <= NUMBER_OF_ROUNDS; ++roundId) {
			RockPaperScissorsRound round = RockPaperScissorsRound.fromId(roundId);
			report.playRound(round, player1, player2);
		}

		GameStatistics<RockPaperScissorsGame> statistics = report.getStatistics();

		GameStatisticsPrinter<RockPaperScissorsGame> printer = null;

		String results = printer.print();

		System.out.println(results);
	}

}
