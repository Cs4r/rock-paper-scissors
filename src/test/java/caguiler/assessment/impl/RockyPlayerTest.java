package caguiler.assessment.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Unit tests for {@link RockyPlayer}
 * 
 * @author Cesar Aguilera <cesar.aguilera.p@gmail.com>
 *
 */
public class RockyPlayerTest {

	@Test(expected = IllegalArgumentException.class)
	public void ofThrowsIllegalArgumentExceptionWhenANegativeIdIsGiven() {
		RockyPlayer.of(-1);
	}

	@Test
	public void ofCreatesANotNullRockyPlayerWhenIdIsPositive() {
		assertNotNull(RockyPlayer.of(1));
	}
	
	@Test
	public void ofCreatesAPlayerWithTheGivenId() {
		int expected = 1;
		RockyPlayer player = RockyPlayer.of(expected);
		assertEquals(expected, player.getId());
	}
	
	@Test
	public void getRoleAlwaysReturnsRockAsGameRole(){
		RockyPlayer player = RockyPlayer.of(1);
		for(int i = 0; i < 10; ++i){
			assertEquals(RockPaperScissors.ROCK, player.getRole());
		}
	}
}
