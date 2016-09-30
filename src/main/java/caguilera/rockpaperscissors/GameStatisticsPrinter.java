package caguilera.rockpaperscissors;

/**
 * Produces printable results for {@link GameStatistics}
 * 
 * @author Cesar Aguilera
 *
 * @param <T>
 *            any {@link Game}
 */

public interface GameStatisticsPrinter<T extends Game> {

	public String print();

}
