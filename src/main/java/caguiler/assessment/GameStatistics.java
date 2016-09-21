package caguiler.assessment;

/**
 * Contains the statistics of a game played during a sequence of rounds
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 *
 * @param <T>
 *            any {@link Game}
 */
public interface GameStatistics<T extends Game> {

	int getNumberOfGameRounds();

	int getFirstPlayerWins();

	int getFirstPlayerLosses();

	int getFirstPlayerTies();

	int getSecondPlayerWins();

	int getSecondPlayerLosses();

	int getSecondPlayerTies();
}
