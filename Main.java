/**
 * Driver program that creates standard 52-card deck (as Card array)
 * and prints out each card in deck.
 *
 * @author Mya Baxter
 * @version 
 */

public class Main {

	/* ALGORITHM
	*
	1. Generate 52 card deck into Card array
	 *    - Goes through all values: 1 to 13 (Ace to King)
	 *    - For each value, go through through the four suits (♥, ♦, ♣, ♠)
	 *    - Create Card objects for each value-suit combination and put in array
	2. Print deck (simple)
	* - Iterate through array and print each card's simple representation
	*
	*/
	
    /**
     * Main entry point for the program.
     * Generates and prints a deck of 52 cards.
     * 
     */
	public static void main(String[] args) 
	{
		/*** RUNNING TESTER ***/
		//uncomment line below to run CardTester:
		//CardTester.main(null);

		/*** DRIVER PROGRAM ***/
		//1. Generate 52 card deck into Card array
	Card[] deck = new Card[52];
        char[] suits = {Card.HEART, Card.DIAMOND, Card.CLUB, Card.SPADE};
        int index = 0;
		for (char suit : suits) 
		{
            for (int value = 1; value <= 13; value++) {
                deck[index++] = new Card(value, suit);
            }
        }
		//2. Print deck
		for (Card card : deck) 
	{
            System.out.println(card.toString());
        }
	}
}