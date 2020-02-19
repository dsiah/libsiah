package libsiah.utils;

import libsiah.LinkedList;

public final class LinkedLists {
    private LinkedLists() {}

    public static <T> LinkedList<T> fromArray(T[] vals) {
        if (vals == null || vals.length < 1) return null;

        final LinkedList<T> head = new LinkedList<>(vals[0]);
        LinkedList<T> curr = head;
        for (int i = 1; i < vals.length; i++) {
            curr.setNext(new LinkedList<>(vals[i]));
            curr = curr.getNext();
        }

        return head;
    }

    public static <T> void add(LinkedList<T> head, LinkedList<T> element) {
        if (head == null || element == null) {
            throw new IllegalArgumentException("Cannot add with null argument(s).");
        }

        while (head.hasNext()) {
            head = head.getNext();
        }
        head.setNext(element);
    }
}