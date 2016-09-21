package caguiler.assessment;

/**
 * Produces printable results for {@link GameStatistics}
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 *
 * @param <T>
 *            the {@link Game}
 */

public interface GameStatisticsPrinter<T extends Game> {

	public String print();

}
