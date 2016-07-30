/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures.heap.disjoint_set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import data_structures.disjoint_set.Quick_union_Weighted_with_Path_Compression;
/**
 *
 * @author Ashish
 */
public class Quick_Union_Weighted_with_Path_Compression_Test {
    
    Quick_union_Weighted_with_Path_Compression wp_qu_set;
    
    @Before
    public void setUp() {
        wp_qu_set = new Quick_union_Weighted_with_Path_Compression();
        wp_qu_set.MAKESET(10);
        wp_qu_set.UNION(0, 1);
        wp_qu_set.UNION(1, 2);
        wp_qu_set.UNION(9, 8);
        wp_qu_set.UNION(9, 0);
    }
    
    @After
    public void tearDown() {
        wp_qu_set=null;
    }

    @Test
    public void test_MakeSet(){
        wp_qu_set.MAKESET(10);
        assertEquals(0,wp_qu_set.FIND(0));
        assertEquals(9,wp_qu_set.FIND(9));
        
        assertEquals(0,wp_qu_set.FIND(0));
        assertEquals(9,wp_qu_set.FIND(9));
    }
    
    @Test
    public void test_Union(){
        assertEquals(wp_qu_set.FIND(0),wp_qu_set.FIND(9));
        assertEquals(wp_qu_set.FIND(2),wp_qu_set.FIND(8));
    }
    
    @Test
    public void test_connected(){
        assertEquals(true,wp_qu_set.connected(0, 1));
        assertEquals(true,wp_qu_set.connected(0, 9));
        assertEquals(true,wp_qu_set.connected(7, 7));
        assertEquals(false,wp_qu_set.connected(5, 4));
    }
}
