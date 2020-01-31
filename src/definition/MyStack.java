/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 31/01/20
 *   Time: 11:06 AM
 */

package definition;

import adt.StackADT;

/**
 * It is the definition class for the implementation of the ADT interface.
 */
public class MyStack<E> implements StackADT<E> {

    // this node will store the reference to the node at the "top" of the stack.
    private Node<E> top = null;
    // this will store the current size of the stack.
    private int size = 0;

    @Override
    public E peek() {
        E response = null;
        return response;
    }

    @Override
    public boolean isEmpty() {
        // check if the current size of the stack is zero.
        return size == 0;
    }

    private static class Node<E> {
        private E data;
        private Node<E> next;

        private Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        private E getData() {
            return data;
        }

        private Node<E> getNext() {
            return next;
        }
    }
}
