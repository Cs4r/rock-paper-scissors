package caguiler.assessment.impl;

import caguiler.assessment.GameRound;

/**
 * A round of {@link RockPaperScissorsGame}
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 *
 */
public class RockPaperScissorsRound implements GameRound<RockPaperScissorsGame> {

	private final int id;

	private RockPaperScissorsRound(int id) {
		this.id = id;
	}

	@Override
	public int getId() {
		return id;
	}

	/**
	 * Creates instances of {@link RockPaperScissorsRound}
	 * 
	 * @param id
	 *            the round's id
	 * @return a new instance of {@link RockPaperScissorsRound} with the given
	 *         id
	 * @throws IllegalArgumentException
	 *             if the given id is not positive
	 */
	public static RockPaperScissorsRound fromId(int id) {
		if (id < 1) {
			throw new IllegalArgumentException();
		}
		return new RockPaperScissorsRound(id);
	}

}
