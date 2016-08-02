package data_structures.stack;
/**
 *
 * @author Ashish
 */

/*Here we are using a generic with a interface*/
public interface Stack_ADT<T>{
    public void push(T item);
    public T pop();
    public boolean isEmpty();
    public int getSize();
}
