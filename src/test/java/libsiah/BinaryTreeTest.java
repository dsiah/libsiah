/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package libsiah;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryTreeTest {
    @Test 
    public void constructor_withInteger_successful() {
        BinaryTree<Integer> tree = new BinaryTree<>(1);

        assertEquals(Integer.valueOf(1), tree.getVal());
    }

    @Test
    public void constructor_withString_successful() {
        BinaryTree<String> tree = new BinaryTree<>("one");

        assertEquals("one", tree.getVal());
    }

    @Test
    public void setVal_withNewString_successful() {
        BinaryTree<String> tree = new BinaryTree<>("one");
        tree.setVal("two");

        assertEquals("two", tree.getVal());
    }

    @Test
    public void constructor_withLeft_successful() {
        BinaryTree<Integer> left = new BinaryTree<>(0);
        BinaryTree<Integer> tree = new BinaryTree<>(1, left, null);

        assertEquals(Integer.valueOf(0), tree.getLeft().getVal());
    }

    @Test
    public void constructor_withRight_successful() {
        BinaryTree<Integer> right = new BinaryTree<>(2);
        BinaryTree<Integer> tree = new BinaryTree<>(1, null, right);

        assertEquals(Integer.valueOf(2), tree.getRight().getVal());
    }

    @Test
    public void setLeft_withNewNode_successful() {
        BinaryTree<Integer> left = new BinaryTree<>(0);
        BinaryTree<Integer> tree = new BinaryTree<>(1);

        tree.setLeft(left);

        assertEquals(Integer.valueOf(0), tree.getLeft().getVal());   
    }

    @Test
    public void setRight_withNewNode_successful() {
        BinaryTree<Integer> right = new BinaryTree<>(2);
        BinaryTree<Integer> tree = new BinaryTree<>(1);

        tree.setRight(right);

        assertEquals(Integer.valueOf(2), tree.getRight().getVal());
    }
}