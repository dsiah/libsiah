package libsiah;

public class LinkedList<T> {
    private T val;
    private LinkedList<T> next;

    public LinkedList(T val, LinkedList<T> next) {
        this.val = val;
        this.next = next;
    }

    public LinkedList(T val) {
        this.val = val;
    }

    public LinkedList() {}

    public T getVal() {
        return val;
    }

    public LinkedList<T> getNext() {
        return next;
    }

    public boolean hasNext() {
        return next != null;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public void setNext(LinkedList<T> next) {
        this.next = next;
    }
}
