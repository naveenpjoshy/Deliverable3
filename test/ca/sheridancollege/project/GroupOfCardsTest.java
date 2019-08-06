/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jacqu
 */
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSuit method, of class GroupOfCards.
     */
    @Test
    public void testGetSuitGood() {
        System.out.println("getSuit Good");
        GroupOfCards instance = new GroupOfCards();
        String expResult = null;
        String result = instance.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of getSuit method, of class GroupOfCards.
     */
    @Test
    public void testGetSuitBad() {
        System.out.println("getSuit Bad");
        GroupOfCards instance = new GroupOfCards();
        String expResult = null;
        String result = instance.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of getSuit method, of class GroupOfCards.
     */
    @Test
    public void testGetSuitBoundary() {
        System.out.println("getSuit Boundary");
        GroupOfCards instance = new GroupOfCards();
        String expResult = null;
        String result = instance.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    

    /**
     * Test of setSuit method, of class GroupOfCards.
     */
    @Test
    public void testSetSuitGood() {
        System.out.println("setSuitGood");
        String suit = "Hearts";
        GroupOfCards instance = new GroupOfCards();
        instance.setSuit(suit);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of setSuit method, of class GroupOfCards.
     */
    @Test
    public void testSetSuitBad() {
        System.out.println("setSuitBad");
        String suit = "";
        GroupOfCards instance = new GroupOfCards();
        instance.setSuit(suit);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of setSuit method, of class GroupOfCards.
     */
    @Test
    public void testSetSuitBoundary() {
        System.out.println("setSuitBoundary");
        String suit = "";
        GroupOfCards instance = new GroupOfCards();
        instance.setSuit(suit);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
