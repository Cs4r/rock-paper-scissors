package caguiler.assessment;

/**
 * Tracks 
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 */
public interface GameReport<T extends Game> {

	void playRound(GameRound<T> round, Player<T> player1, Player<T> player2);

	GameStatistics<T> getStatistics();

}
