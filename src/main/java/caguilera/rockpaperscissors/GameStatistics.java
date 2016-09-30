package caguilera.rockpaperscissors;

/**
 * Contains the statistics of a game played during a sequence of rounds
 * 
 * @author Cesar Aguilera
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
