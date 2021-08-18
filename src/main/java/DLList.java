public class DLList {
    private IntNode sentinel;
    private int size;
    private IntNode last;

    private static class IntNode{
        private IntNode prev;
        private int item;
        private IntNode next;

        public IntNode(IntNode prev, int item, IntNode next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }

    public DLList() {
        sentinel = new IntNode(null, 10, null);
        size = 0;
    }

    public DLList(int x) {
        this();
        sentinel.next = new IntNode(sentinel, x, null);
        size  = 1;
    }
    /** Add an item to he front of the list */
    public void addFirst(int x) {
        size++;
        IntNode p = new IntNode(sentinel, x, sentinel.next);
        sentinel.next.prev = p;
        sentinel.next = p;
    }
    /** Add an item to the end of the list */
    public void addLast(int x) {
        size++;
        last.next = new IntNode(last, x, null);
        last = last.next;
    }
    /** Return the first of the list */
    public int getFirst() {
        return sentinel.next.item;
    }
    /** Return the last of the list */
    public int getLast(){
        return last.item;
    }
    /** Return the size of the list */
    public int size(){
        return size;
    }
}
