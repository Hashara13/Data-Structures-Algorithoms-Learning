/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.LinkedList;

public class LLQ {

    class Node {

        int value;
        Node next;
    }

    class LinkedList {

        Node head;

        public static void insertEnd(int data) {
            Node node1 = new Node();
            node1.data = data;
            node1.next = null;

            // check for the empty list
            if (head == null) {
                head = node1;
            } else {
                Node node2 = head;
                while (node2.next != null) {

                    node2 = node2.next; // travel until find the null value
                }
                node2.next = node1;
            }
        }

        public static void insertFront(int data) {
            Node node1 = new Node();
            node1.data = data;
            node1.next = null;
            node1.next = head;
            head = node1;
        }

        public static void insertFBetween(int data, int index) {
            Node node1 = new Node();
            node1.data = data;
            node1.next = null;

            if (index == 0) {
                insertFront(data);
            }

            Node node2 = head;
            for int (i = 0); i < index - 1;
            i++
            
            
                ){
            node2 = node2.next;
                node1.next = node2.next;
                node2.next = node1;
            }
        }

        public void delete(int index) {
            if (index == 0) {
                head = head.next;
            } else {
                Node node2 = head;
                Node node3 = null;
                for int (i = 0; i < index - 1;
                i++ ){
                node2 = node2.next;
                node3 = node2.next;
                node2.next = node3.next;
                }
            }
        }

        public void show() {
            Node node1 = head;
            while (node1.next != null) {
                node1 = node1.next;
            }
            System.out.println(node1.data);
        }
    }

    public static void main(String[] args) {
        LLQ list = new LinkedList<>();
        list.insertEnd(5);
        list.insertEnd(25);
        list.show();

    }
}
