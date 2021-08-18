package lists;

import sun.security.krb5.internal.Ticket;

import javax.print.DocFlavor;

/**
 *  items:[8 7 6 4 9 0 0 0 0 ]
 *  size :5
 *
 *  Invariants:
 *  addLast: The next item we want to add, will go into position size
 *  getLast: The item we want to return is in position size - 1
 *  size: The number of items in the list should be size
 */

public class AList {
    private int[] items;
    private int size;
    /** Create an empty list */
    public AList() {
        items = new int[10];
        size = 0;
    }
    public void resize(int x){
        int[] temp = new int[x];
        System.arraycopy(items,0,temp,0,size);
        items = temp;
    }
    /** Insert X into the back of the list */
    public void addLast(int x){
        if (size == items.length){
            resize(size * 2);
        }
        items[size] = x;
        size++;
    }
    /** Returns the item from the back of the list */
    public int getLast(){
        return items[size - 1];
    }
    /** Gets the ith item int the list (0 is the front) */
    public int get(int i){
        return items[i];
    }
    /** Return the number of items int he list */
    public int size(){
        return size;
    }
    /** Delete item from back of the list and returns deleted item */
    public int removeLast(){
        size--;
        return items[size];
    }
}
