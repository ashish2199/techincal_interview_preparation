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
public interface Disjoint_set_ADT {
    //initialize union-find data structure with N objects (0 to N – 1)
    public void MAKESET( int n );

    //add connection between p and q
    public int FIND( int p );
    
    //are p and q in the same component?
    public void UNION( int p , int q );
    
    //component identifier for p (0 to N – 1)
    public boolean connected( int p,int q );
    
    /*
    number of components
    public int count();
    */
}
