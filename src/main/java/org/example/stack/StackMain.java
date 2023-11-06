package org.example.stack;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Ban");
        stack.push("Mark");
        stack.push("Robin");
        stack.push("Daniel");
        stack.push("Nick");

        // Looks at the object at the top of this stack without removing it from the stack.
        System.out.println(stack.peek());

        // Removes the object at the top of this stack and returns that object as the value of this function.
        System.out.println(stack.pop());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}
