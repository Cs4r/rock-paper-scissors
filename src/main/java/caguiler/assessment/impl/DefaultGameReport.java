package caguiler.assessment.impl;

import caguiler.assessment.Game;
import caguiler.assessment.GameReport;
import caguiler.assessment.GameRoundResult;
import caguiler.assessment.GameStatistics;
import caguiler.assessment.Player;

/**
 * Default and naive implementation of {@link GameReport}
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 *
 * @param <T>
 *            any {@link Game}
 */
public class DefaultGameReport<T extends Game> implements GameReport<T> {

	@Override
	public void registerResult(GameRoundResult round, Player<T> player1, Player<T> player2) {
		
	}

	@Override
	public GameStatistics<T> getStatistics() {
		return null;
	}
}
