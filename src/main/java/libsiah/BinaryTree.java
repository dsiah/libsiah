package libsiah;

public class BinaryTree<T> {
    private T val;
    private BinaryTree<T> left;
    private BinaryTree<T> right;

    public BinaryTree(T val) {
        this.val = val;
    }

    public BinaryTree(T val, BinaryTree<T> left, BinaryTree<T> right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public BinaryTree<T> getLeft() {
        return left;
    }

    public BinaryTree<T> getRight() {
        return right;
    }

    public T getVal() {
        return val;
    }

    public void setLeft(BinaryTree<T> left) {
        this.left = left;
    }

    public void setRight(BinaryTree<T> right) {
        this.right = right;
    }

    public void setVal(T val) {
        this.val = val;
    }
}