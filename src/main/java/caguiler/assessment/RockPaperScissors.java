package caguiler.assessment;

/**
 * The rock, paper, scissors game (Our game)
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 *
 */
public class RockPaperScissors implements Game {
	
	private RockPaperScissors(){}

	public static final GameRole<RockPaperScissors> ROCK = new GameRole<RockPaperScissors>() {
		@Override
		public boolean canBeat(GameRole<RockPaperScissors> other) {
			return other == SCISSORS;
		}
	};

	public static final GameRole<RockPaperScissors> PAPER = new GameRole<RockPaperScissors>() {
		@Override
		public boolean canBeat(GameRole<RockPaperScissors> other) {
			return other == ROCK;
		}
	};

	public static final GameRole<RockPaperScissors> SCISSORS = new GameRole<RockPaperScissors>() {
		@Override
		public boolean canBeat(GameRole<RockPaperScissors> other) {
			return other == PAPER;
		}
	};
}
