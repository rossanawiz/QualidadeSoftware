import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

import com.fbergeron.card.ClassicDeck;


public class ClassicDeckTest {

	/**
	 * Testa a fun��o de construir cartas, executada no construtor
	 */
	@Test
	public void testBuildCards() {
		ClassicDeck deck = new ClassicDeck(null);
		assertEquals(52, deck.cardCount());
	}

	/**
	 * Testa a fun��o de embaralhar
	 */
	@Test
	public void testShuffle() {
		ClassicDeck deck = new ClassicDeck(null);
		Vector cards = (Vector) deck.getCards().clone();
		deck.shuffle(3);
		Vector shuffledCards = deck.getCards();	
		assertNotEquals(cards, shuffledCards);
	}

//	@Test
//	public void testFirstFaceUp() {
//		ClassicDeck deck = new ClassicDeck(null);
//		
//	}

}
