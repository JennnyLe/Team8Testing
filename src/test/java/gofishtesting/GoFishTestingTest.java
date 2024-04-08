/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package gofishtesting;

import java.util.Scanner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 * @author saadkhan, jennyle, destinyodia
 *
 */

public class GoFishTestingTest {
    
    public GoFishTestingTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of promptForRank method, of class GoFishTesting.
    @Test
    public void testPromptForRank() {
        System.out.println("promptForRank");
        Scanner scanner = null;
        String playerId = "";
        GoFishTesting instance = null;
        Rank expResult = null;
        Rank result = instance.promptForRank(scanner, playerId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } */

    /**
     * Test of checkBooks method, of class GoFishTesting.
     * Tests that checkBooks method correctly identifies and removes books from player's hand
     */
    @Test
    public void testCheckBooksGood() {
        // We will stimulate a player's hand containing a book
        Player player = new Player("Player A");
        player.getHand().addCard(new Card(Rank.ACE, Suit.HEARTS));
        player.getHand().addCard(new Card(Rank.ACE, Suit.DIAMONDS));
        player.getHand().addCard(new Card(Rank.ACE, Suit.CLUBS));
        player.getHand().addCard(new Card(Rank.ACE, Suit.SPADES));
        
        GoFishTesting game = new GoFishTesting("Player A");
        assertDoesNotThrow(() -> game.checkBooks(player));
        assertEquals(1, player.getHand().getBooks().size());
        assertEquals(Rank.ACE, player.getHand().getBooks().get(0));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckBooksBad() {
        // We will stimulate a game where there is no player
        Player player = null;
        GoFishTesting game = new GoFishTesting("Player A");
        assertThrows(NullPointerException.class, () -> game.checkBooks(player));
    }

    @Test
    public void testCheckBooksBoundary() {
        // We will stimulate a player's hand with cards but no books
        Player player = new Player("Player A");
        player.getHand().addCard(new Card(Rank.ACE, Suit.HEARTS));
        player.getHand().addCard(new Card(Rank.TWO, Suit.DIAMONDS));
        player.getHand().addCard(new Card(Rank.THREE, Suit.CLUBS));
        player.getHand().addCard(new Card(Rank.FOUR, Suit.SPADES));
        
        GoFishTesting game = new GoFishTesting("Player A");
        assertEquals(0, player.getHand().getBooks().size());
    }
    
    /**
     * Test of getRandomRank method, of class GoFishTesting.
    @Test
    public void testGetRandomRank() {
        System.out.println("getRandomRank");
        Player player = null;
        GoFishTesting instance = null;
        Rank expResult = null;
        Rank result = instance.getRandomRank(player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } */

    /**
     * Test of play method, of class GoFishTesting.
    @Test
    public void testPlay() {
        System.out.println("play");
        GoFishTesting instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } */

    /**
     * Test of main method, of class GoFishTesting.
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GoFishTesting.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } */
    
}
