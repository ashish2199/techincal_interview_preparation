package data_structures.disjoint_set;

/**
 *
 * @author Ashish
 */
public class Quick_Find implements Disjoint_set_ADT
{
    private int[] id;

    @Override
    public void MAKESET(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++){
            id[i] = i;
        }
    }

    @Override
    public int FIND(int p) {
        return id[p];
    }

    @Override
    public void UNION(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++){
            if (id[i] == pid){ 
                id[i] = qid; 
            }
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return id[p] == id[q]; 
    }   
}
