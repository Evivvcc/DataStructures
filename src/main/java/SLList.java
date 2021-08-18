

/** A SLList with a sentinel node has at least the following invariants:
 *  The sentinel reference always point to a sentinel node
 *  The front item (if it exists) is always at sentinel.next.item
 *  The size variable is always the total number of items that have been added
 */

public class SLList {
    private IntNode sentinel;
    private int size;
    private IntNode last;

    private static class IntNode{
        private int item;
        private IntNode next;

        public IntNode(int item, IntNode intNode) {
            this.item = item;
            this.next = intNode;
        }
    }

    public SLList() {
        sentinel = new IntNode(10,null);
        size = 0;
    }

    public SLList(int x) {
        sentinel = new IntNode(10,null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /** Add an item to the front of the list */
    public void addFirst(int x) {
        size++;
        sentinel.next = new IntNode(x, sentinel.next);
    }
    /** Add an item to the end of the list */
    public void addLast(int x) {
        size++;
        last.next = new IntNode(x, null);
    }
    /** Return the size of the list */
    public int size() {
        return size;
    }
    /** Return the first item of the list */
    public int getFirst() {
        return sentinel.next.item;
    }
    /** Return the last item of the list */
    public int getLast(){
        return last.item;
    }

}
