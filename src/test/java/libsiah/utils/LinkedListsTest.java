package libsiah.utils;

import org.junit.Test;
import static org.junit.Assert.*;

import libsiah.LinkedList;

public class LinkedListsTest {
    @Test 
    public void fromArray_withInteger_returnsSingleNode() {
        LinkedList<Integer> head = LinkedLists.fromArray(new Integer[]{ 1 });

        assertEquals(Integer.valueOf(1), head.getVal());
    }

    @Test 
    public void fromArray_withIntegers_returnsSequence() {
        LinkedList<Integer> head = LinkedLists.fromArray(new Integer[]{ 1, 2, 3 });

        assertEquals(Integer.valueOf(1), head.getVal());
    }

    @Test 
    public void fromArray_withNull_returnsNull() {
        LinkedList<Integer> head = LinkedLists.fromArray(null);

        assertNull(head);
    }

    @Test 
    public void fromArray_withEmptyArray_returnsNull() {
        LinkedList<Integer> head = LinkedLists.fromArray(new Integer[]{});

        assertNull(head);
    }

    @Test
    public void add_withTwoNodes_appendsCorrectThirdNode() {
        LinkedList<Integer> head = new LinkedList<>(1);
        head.setNext(new LinkedList<>(2));
        LinkedList<Integer> tail = new LinkedList<>(3);

        LinkedLists.add(head, tail);

        assertEquals(Integer.valueOf(1), head.getVal());
        assertEquals(Integer.valueOf(2), head.getNext().getVal());
        assertEquals(Integer.valueOf(3), head.getNext().getNext().getVal());
    }

    @Test(expected = IllegalArgumentException.class)
    public void add_withNullElement_throwsIllegalArgException() {
        LinkedList<Integer> head = new LinkedList<>(1);
        LinkedLists.add(head, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void add_withNullList_throwsIllegalArgException() {
        LinkedList<Integer> tail = new LinkedList<>(1);
        LinkedLists.add(null, tail);
    }
}
