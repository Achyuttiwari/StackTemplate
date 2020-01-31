/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 31/01/20
 *   Time: 12:09 PM
 */

package execution;

import definition.MyStack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 to \"Push\" a node at the top.");
            System.out.println("Press 2 to \"Pop\" a node from the top.");
            System.out.println("Press 3 to \"Peek\" at the node at the top.");
            System.out.println("Press 4 to exit.");
        }
    }
}
