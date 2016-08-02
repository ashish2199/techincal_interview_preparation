package data_structures.stack;

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
public class stack_resizable_array_test {
    stack_resizable_array<Integer>  st;
    
    @Before
    public void setUp() {
        st=new stack_resizable_array<>();
        //Fill the stack with 0 to 99
        for (int i = 0; i < 100; i++) {
            st.push(i);
        }
    }
    
    @After
    public void tearDown() {
        st=null;
    }

    @Test
    public void test_pop() {
        int result = st.pop();
        assertEquals(99, result);
        assertEquals(99, st.getSize());
        
        result = st.pop();
        assertEquals(98, result);
        
        result = st.pop();
        assertEquals(97, result);
        
        result = st.pop();
        assertEquals(96, result);
    }

    @Test
    public void test_push() {
        assertEquals(100, st.getSize());
        st.push(0);
        st.push(1);
        st.push(2);
        assertEquals(103, st.getSize());
        int result = st.pop();
        assertEquals(2, result);
    }
    
    @Test
    public void test_getSize(){
            assertEquals(100, st.getSize());
    }

}
