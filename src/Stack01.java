/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
// Stack Implementation
import java.io.*;
import java.util.*;

public class Stack01 {

    public static void main(String[] args) {
        
        // iniotialize stack & push
        Stack<String> stack12 = new Stack<String>();
        stack12.push("hjj");
        System.out.println(stack12);
        
        // show peek stack
        System.out.println(stack12.peek());
        
        // remove elemant
        System.out.println(stack12.pop());
    }

    class Stack012 {

        private Stack<Integer> stack;

        public Stack012() {
            this.stack = stack;
        }

        // push elemant on top
        static void push(Stack<Integer> stack) {
            for (int i = 0; i < 5; i++) {
                stack.push(i);
            }
        }

        // pop elemant from top
        static void pop(Stack<Integer> stack) {
            for (int i = 0; i < 5; i++) {
                Integer a = (Integer) stack.pop();
                System.out.println(a);
            }
        }

        // show elemant from top of the stack
        static void showtop(Stack<Integer> stack) {

            Integer b = (Integer) stack.peek();
            System.out.println(b);
        }

        // search elemant from  stack
        static void search(Stack<Integer> stack, int elemant) {

            Integer c = (Integer) stack.search(elemant);
            if (c == -1) {
                System.out.println("NOt found");
            } else {
                System.out.println("Elemant is " + c);
            }
        }
    }
}
