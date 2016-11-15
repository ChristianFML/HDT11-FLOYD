/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christian
 */
public class graphIT {
    
    public graphIT() {
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
     * Test of addEdge method, of class graph.
     */
    @Test
    public void testAddEdge() {
        System.out.println("addEdge");
        String line = "";
        graph instance = new graph();
        instance.addEdge(line);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of distBetweenNodes method, of class graph.
     */
    @Test
    public void testDistBetweenNodes() {
        System.out.println("distBetweenNodes");
        String city1 = "";
        String city2 = "";
        graph instance = new graph();
        int expResult = 0;
        int result = instance.distBetweenNodes(city1, city2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteEdge method, of class graph.
     */
    @Test
    public void testDeleteEdge() {
        System.out.println("deleteEdge");
        String city1 = "";
        String city2 = "";
        graph instance = new graph();
        instance.deleteEdge(city1, city2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class graph.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        String city = "";
        graph instance = new graph();
        boolean expResult = false;
        boolean result = instance.contains(city);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class graph.
     */
    @Test
    public void testToString_0args() {
        System.out.println("toString");
        graph instance = new graph();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class graph.
     */
    @Test
    public void testToString_String_String() {
        System.out.println("toString");
        String city1 = "";
        String city2 = "";
        graph instance = new graph();
        String expResult = "";
        String result = instance.toString(city1, city2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCenter method, of class graph.
     */
    @Test
    public void testGetCenter() {
        System.out.println("getCenter");
        graph instance = new graph();
        String expResult = "";
        String result = instance.getCenter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
