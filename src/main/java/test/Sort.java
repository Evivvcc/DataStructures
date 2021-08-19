package test;

public class Sort {

    public static void sort(String[] x){
        // Find the smallest item
        // Move it to the front
        // Selection sort the remaining
        sort(x,0);
    }
    /** help method
     *  Sorts x starting at position start */
    private static void sort(String[] x, int start) {
        if (start == x.length) {
            return;
        }
        int smallestIndex = findSmallest(x,start);
        swap(x,start,smallestIndex);
        sort(x, start + 1);

    }
    /** Return the index of the smallest string in x */
    public static void findSmallest(String[] x){
        findSmallest(x, 0);
    }

    public static int findSmallest(String[] x,int start){
        int smallestIndex = start;
        for (int i = start; i < x.length; i++) {
            if (x[smallestIndex].compareTo(x[i]) > 0) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    /** swap item a with b */
    public static void swap(String[] x, int a, int b){
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

}
