package data_structures.queue;
import java.util.Iterator;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
/**
 *
 * @author Ashish
 */
public class queue_linked_list_based_test {
    queue_ADT<Integer>  qu;
    
    @Before
    public void setUp() {
        qu=new queue_linked_list_based<>();
        //Fill the stack with 0 to 99
        for (int i = 0; i < 100; i++) {
            qu.enqueue(i);
        }
    }
    
    @After
    public void tearDown() {
        qu=null;
    }
    
    @Test
    public void enque_Test(){
        //insert new items
        for (int i = 0; i < 10; i++) {
            qu.enqueue(i);
        }
        //remove old items
        for (int i = 0; i < 100; i++) {
            qu.dequeue();
        }
        for (int i = 0; i < 10; i++) {
            assertEquals(i, (int)qu.dequeue());
        }
    }
    
    @Test
    public void dequeue_Test(){
        assertEquals( 0 , (int)qu.dequeue() );
        assertEquals( 1 , (int)qu.dequeue() );
        assertEquals( 2 , (int)qu.dequeue() );
    }
    
    @Test
    public void getSize_test(){
        assertEquals(100, qu.getSize());
    }
    
    @Test
    public void isEmpty_Test(){
        assertEquals(false, qu.isEmpty());
    }
    
    @Test
    public void iterator_Test(){
        queue_linked_list_based<Integer> qu_l=(queue_linked_list_based<Integer>) qu;
        Iterator it = qu_l.iterator();
        for (int j = 0; j < 100; j++) {
            assertEquals(j, it.next());
        }
        assertEquals(false, it.hasNext());
    }
}
