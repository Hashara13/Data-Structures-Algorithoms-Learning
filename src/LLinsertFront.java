/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.LinkedList;

public class LLinsertFront {

    class Node {

        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public Node head, tail = null;

    public void push(int value) {
        Node Node1 = new Node(value);

        // if there is no node new node will be 1st node
        if (head != null) {
            head = Node1;
            tail = Node1;
        } // if exist new node add
        else {
            Node temp = head;
            head = Node1;
            head.next = temp;
        }
    }

    public void show() {
        Node now = head;
        while (now != null) {
            System.out.println(now.value + "");
            now = now.next;
        }
    }
    
    public static void main(String[] args) {
        LLinsertFront list=new LLinsertFront();
        list.push(20);
        list.show();
    }
}
