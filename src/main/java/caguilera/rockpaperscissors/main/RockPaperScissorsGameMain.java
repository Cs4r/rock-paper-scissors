package caguilera.rockpaperscissors.main;

import caguilera.rockpaperscissors.GameReport;
import caguilera.rockpaperscissors.GameRoundResult;
import caguilera.rockpaperscissors.GameStatistics;
import caguilera.rockpaperscissors.GameStatisticsPrinter;
import caguilera.rockpaperscissors.Player;
import caguilera.rockpaperscissors.impl.DefaultGameReport;
import caguilera.rockpaperscissors.impl.GameStatisticsPrinters;
import caguilera.rockpaperscissors.impl.RandomPlayer;
import caguilera.rockpaperscissors.impl.RockPaperScissorsGame;
import caguilera.rockpaperscissors.impl.RockPaperScissorsRound;
import caguilera.rockpaperscissors.impl.RockyPlayer;

/**
 * 
 * Program that plays 20 iterations of Rock, Paper, Scissors.
 * 
 * One player always plays randomly, the other always chooses rock.
 * 
 * At the end it shows how many games each player has one and how many were a
 * draw.
 * 
 * @author Cesar Aguilera
 *
 */
public class RockPaperScissorsGameMain {
	public static final int NUMBER_OF_ROUNDS = 20;

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
