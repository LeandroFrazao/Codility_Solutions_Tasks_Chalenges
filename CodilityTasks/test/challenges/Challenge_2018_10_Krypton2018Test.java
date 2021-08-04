/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenges;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leand
 */
public class Challenge_2018_10_Krypton2018Test {
    
    public Challenge_2018_10_Krypton2018Test() {
    
    }

   
    /**
     * Test of solution method, of class Challenge_2018_10_Krypton2018.
     */
    @Test
    public void testSolution() {
        System.out.println("solution");
       // int[][] A = new int[][]{{1, 1}, {0, 1}};
        Challenge_2018_10_Krypton2018 instance = new Challenge_2018_10_Krypton2018();
//        int expResult = 0;
//        int result = instance.solution(A);
//        assertEquals(expResult, result);
       
    assertEquals(0, instance.solution(new int[][]{{1, 1}, {0, 1}}));
    assertEquals(1, instance.solution(new int[][]{{10}}));
    assertEquals(1, instance.solution(new int[][]{{1, 2, 0}, {10, 5, 3}, {5, 1, 2}}));
    assertEquals(1, instance.solution(new int[][]{{2, 10, 1, 3}, {10, 5, 4, 5}, {2, 10, 2, 1}, {25, 2, 5, 1}}));
    assertEquals(1, instance.solution(new int[][]{{10, 10, 10}, {10, 0, 10}, {10, 10, 10}}));
    assertEquals(2, instance.solution(new int[][]{{10, 1, 10, 1}, {1, 1, 1, 10}, {10, 1, 10, 1}, {1, 10, 1, 1}}));
    assertEquals(3, instance.solution(new int[][]{{10, 1, 10, 1}, {1, 1, 1, 10}, {10, 1, 10, 1}, {1, 10, 1, 10}}));
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

   
}
