package adt;

/**
 * It is the ADT specification for a sample stack implementation.
 */
public interface StackADT<E> {
    /**
     * This method will return the data of the node that is placed at the "top" of the stack.
     *
     * @return the data of the node at the top of the stack, NoSuchElementException if the stack was empty.
     */
    E peek();

    /**
     * This method will determine whether the stack is currently empty.
     *
     * @return boolean TRUE if the stack if empty else boolean FALSE
     */
    boolean isEmpty();


    /**
     * This method will "push" a node at the top of the stack.
     *
     * @param data The data of the node to be inserted.
     */
    void push(E data);
}
