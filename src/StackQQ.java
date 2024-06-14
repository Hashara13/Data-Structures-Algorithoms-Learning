/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */

import java.util.*;

class Stack1{
    
    static void push(Stack <Integer> stack){ // push the elements
        for(int i=0;i<5;i++){
            stack.push(i);
        }
    }
    
    static void pop(Stack <Integer> stack){ // pop the elements
        for(int i=0;i<5;i++){
            Integer a=(Integer) stack.pop();
            System.out.println(a);
        }     
        }
    
    static void peek(Stack <Integer> stack){ // see peek elements
        for(int i=0;i<5;i++){
            Integer b=(Integer) stack.peek();
            System.out.println(b);
        }     
        }
    
    static void search(Stack <Integer> stack){ // search elements
        for(int i=0;i<5;i++){
            Integer c=(Integer) stack.search(b);
            if(c==-1){
                System.out.println("Not Found");
            }
            else{
                System.out.println(c);
            }
        }     
        }
}
public class StackQQ {
    public static void main(String[] args) {
        Stack <Integer> stack2=new Stack<Integer>();
        stack2.push(5);
        stack2.pop(stack);
        stack2.peek(5);
        stack2.search(0);
        
    }
}
