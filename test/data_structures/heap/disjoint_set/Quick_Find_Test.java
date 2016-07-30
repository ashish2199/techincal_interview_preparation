package data_structures.heap.disjoint_set;

import data_structures.disjoint_set.Quick_Find;
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
public class Quick_Find_Test {
    
    Quick_Find qf_set;
    
    @Before
    public void setUp() {
        qf_set = new Quick_Find();
        qf_set.MAKESET(10);
        qf_set.UNION(0, 1);
        qf_set.UNION(1, 2);
        qf_set.UNION(9, 8);
        qf_set.UNION(9, 0);
    }
    
    @After
    public void tearDown() {
        qf_set=null;
    }

    @Test
    public void test_MakeSet(){
        qf_set.MAKESET(10);
        assertEquals(0,qf_set.FIND(0));
        assertEquals(9,qf_set.FIND(9));
        
        assertEquals(0,qf_set.FIND(0));
        assertEquals(9,qf_set.FIND(9));
    }
    
    @Test
    public void test_Union(){
        assertEquals(qf_set.FIND(0),qf_set.FIND(9));
        assertEquals(qf_set.FIND(2),qf_set.FIND(8));
    }
    
    @Test
    public void test_connected(){
        assertEquals(true,qf_set.connected(0, 1));
        assertEquals(true,qf_set.connected(0, 9));
        assertEquals(true,qf_set.connected(7, 7));
        assertEquals(false,qf_set.connected(5, 4));
    }    
}
