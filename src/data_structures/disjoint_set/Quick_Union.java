package data_structures.disjoint_set;
/**
 *
 * @author Ashish
 */
public class Quick_Union implements Disjoint_set_ADT{

    private int[] id;

    @Override
    public void MAKESET(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++){
            id[i] = i;
        }
    }

    private int root(int i)
    {
        while (i != id[i]) i = id[i];
        return i;
    }
    
    @Override
    public int FIND(int p) {
        return root(p);
    }

    @Override
    public void UNION(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }
    
}
