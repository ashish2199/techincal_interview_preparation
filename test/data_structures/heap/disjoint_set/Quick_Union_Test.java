/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures.heap.disjoint_set;

import data_structures.disjoint_set.Quick_Union;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ashish
 */
public class Quick_Union_Test {
    
    Quick_Union qu_set;
    
    @Before
    public void setUp() {
        qu_set = new Quick_Union();
        qu_set.MAKESET(10);
        qu_set.UNION(0, 1);
        qu_set.UNION(1, 2);
        qu_set.UNION(9, 8);
        qu_set.UNION(9, 0);
    }
    
    @After
    public void tearDown() {
        qu_set=null;
    }

    @Test
    public void test_MakeSet(){
        qu_set.MAKESET(10);
        assertEquals(0,qu_set.FIND(0));
        assertEquals(9,qu_set.FIND(9));
        
        assertEquals(0,qu_set.FIND(0));
        assertEquals(9,qu_set.FIND(9));
    }
    
    @Test
    public void test_Union(){
        assertEquals(qu_set.FIND(0),qu_set.FIND(9));
        assertEquals(qu_set.FIND(2),qu_set.FIND(8));
    }
    
    @Test
    public void test_connected(){
        assertEquals(true,qu_set.connected(0, 1));
        assertEquals(true,qu_set.connected(0, 9));
        assertEquals(true,qu_set.connected(7, 7));
        assertEquals(false,qu_set.connected(5, 4));
    }    
}
