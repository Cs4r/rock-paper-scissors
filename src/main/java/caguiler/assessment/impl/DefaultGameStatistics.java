package caguiler.assessment.impl;

import caguiler.assessment.Game;
import caguiler.assessment.GameStatistics;

/**
 * Default implementation of {@link GameStatistics}
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 *
 * @param <T>
 *            any {@link Game}
 */
class DefaultGameStatistics<T extends Game> implements GameStatistics<T> {

	private final int player1Losses;
	private final int player1Wins;
	private final int ties;
	private final int numberOfRounds;

	public DefaultGameStatistics(int player1Wins, int player1Losses, int ties) {
		this.player1Wins = player1Wins;
		this.player1Losses = player1Losses;
		this.ties = ties;
		this.numberOfRounds = player1Wins + player1Losses + ties;
	}

	@Override
	public int getNumberOfGameRounds() {
		return numberOfRounds;
	}

	@Override
	public int getFirstPlayerWins() {
		return player1Wins;
	}

	@Override
	public int getFirstPlayerLosses() {
		return player1Losses;
	}

	@Override
	public int getFirstPlayerTies() {
		return ties;
	}

	@Override
	public int getSecondPlayerWins() {
		return player1Losses;
	}

	@Override
	public int getSecondPlayerLosses() {
		return player1Wins;
	}

	@Override
	public int getSecondPlayerTies() {
		return ties;
	}
}
