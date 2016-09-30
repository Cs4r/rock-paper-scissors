package caguilera.rockpaperscissors.impl;

import static caguilera.rockpaperscissors.impl.RockPaperScissorsGame.ROCK;

import caguilera.rockpaperscissors.GameRole;
import caguilera.rockpaperscissors.GameRound;
import caguilera.rockpaperscissors.Player;

/**
 * A player of {@link RockPaperScissorsGame} whose {@link GameRole} is always
 * {@link RockPaperScissorsGame#ROCK}
 * 
 * @author Cesar Aguilera
 *
 */
public class RockyPlayer implements Player<RockPaperScissorsGame> {

	public RockyPlayer() {
	}

	@Override
	public GameRole<RockPaperScissorsGame> getRole(GameRound<RockPaperScissorsGame> round) {
		if (round == null) {
			throw new IllegalArgumentException();
		}
		return ROCK;
	}

}
