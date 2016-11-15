/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
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
public class FloydAlgorithmIT {
    
    public FloydAlgorithmIT() {
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
     * Test of floyd method, of class FloydAlgorithm.
     */
    @Test
    public void testFloyd() {
        System.out.println("floyd");
        int n = 0;
        ArrayList<ArrayList<Integer>> W = null;
        ArrayList<ArrayList<Integer>> P = null;
        ArrayList<ArrayList<Integer>> D = null;
        FloydAlgorithm instance = new FloydAlgorithm();
        instance.floyd(n, W, P, D);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of path method, of class FloydAlgorithm.
     */
    @Test
    public void testPath() {
        System.out.println("path");
        int q = 0;
        int r = 0;
        FloydAlgorithm instance = new FloydAlgorithm();
        instance.path(q, r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
