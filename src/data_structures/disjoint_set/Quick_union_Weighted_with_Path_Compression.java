/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures.disjoint_set;

/**
 *
 * @author Ashish
 */
public class Quick_union_Weighted_with_Path_Compression implements Disjoint_set_ADT {
    private int[] id;
    private int[] sz;
    
    @Override
    public void MAKESET(int n){
        id = new int[n];
        sz = new int[n];
        for (int i = 0; i < n; i++){
            id[i] = i;
            sz[i] = 1;
        }
    }

    private int root(int i)
    {
        int k = i;
        while (i != id[i]){
            /*
            Make every other node in path point to its
            grandparent (thereby halving path length).
            
            id[i] = id[id[i]]; 
            */
            i = id[i];
        }
        int root=i;
        while (k != id[k]){
            /*
            Make every node in path point to its root.
            */
            int oldIndex=k;
            k = id[k];
            id[oldIndex] = root;
        }
        return i;
    }
    
    @Override
    public int FIND(int p) {
        return root(p);
    }

    @Override
    public void UNION(int p, int q){
        int i = root(p);
        int j = root(q);
        if (sz[i] < sz[j]){ 
            id[i] = j;
            sz[j] += sz[i]; 
        }
        else{ 
            id[j] = i;
            sz[i] += sz[j];
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }
}
