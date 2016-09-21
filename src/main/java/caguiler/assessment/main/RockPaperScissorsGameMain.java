package caguiler.assessment.main;

import caguiler.assessment.GameReport;
import caguiler.assessment.GameRoundResult;
import caguiler.assessment.GameStatistics;
import caguiler.assessment.GameStatisticsPrinter;
import caguiler.assessment.Player;
import caguiler.assessment.impl.DefaultGameReport;
import caguiler.assessment.impl.GameStatisticsPrinters;
import caguiler.assessment.impl.RandomPlayer;
import caguiler.assessment.impl.RockPaperScissorsGame;
import caguiler.assessment.impl.RockPaperScissorsRound;
import caguiler.assessment.impl.RockyPlayer;

/**
 * 
 * Program that plays 100 iterations of Rock, Paper, Scissors
 * (https://en.wikipedia.org/wiki/Rock-paper-scissors).
 * 
 * One player should always play randomly, the other should always choose rock.
 * It should show at the end how many games each player has one and how many
 * were a draw.
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 *
 */
public class RockPaperScissorsGameMain {
	public static final int NUMBER_OF_ROUNDS = 100;

	public static void main(String[] args) {
		final Player<RockPaperScissorsGame> player1 = RandomPlayer.of(1);
		final Player<RockPaperScissorsGame> player2 = RockyPlayer.of(2);
		final GameReport<RockPaperScissorsGame> report = new DefaultGameReport<>();

		for (int roundId = 1; roundId <= NUMBER_OF_ROUNDS; ++roundId) {
			RockPaperScissorsRound round = RockPaperScissorsRound.fromId(roundId);

			GameRoundResult roundResult = player1.getRole(round).canBeat(player2.getRole(round));

			report.registerResult(roundResult, player1, player2);
		}

		GameStatistics<RockPaperScissorsGame> statistics = report.getStatistics();

		GameStatisticsPrinter<RockPaperScissorsGame> printer = GameStatisticsPrinters.toText(statistics);

		String results = printer.print();

		System.out.println(results);
	}

}
