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

    boolean isEmpty();
}
