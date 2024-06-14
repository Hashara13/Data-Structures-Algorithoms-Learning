/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class LinkedList2 {

    private Node head;

    static class Node {

        Node(int new_data) {
        }

        int value;
        Node next;
    }

    public static void main(String[] args) {
        Node head = null;
        Node one = null;
        Node two = null;
        Node three = null;

        // allocate 3 nodes in the heap
        one = new Node(new_data);
        two = new Node(new_data);
        three = new Node(new_data);

        //Assign values
        one.value = 10;
        two.value = 120;
        three.value = 160;

        // Connect nodes
        one.next = two;
        two.next = three;
        three.next = null;

// print the linked list value
        head = one;
        while (head != null) {
            System.out.print(head.value);
            head = head.next;
        }
        
       

    }
    
    // Add new node to front
     public void push(int new_data, Node prev_node){
          
         Node new_node=new Node(new_data);
         
         //make new node as head
         new_node.next=head;
         head=new_node;
         
         // make node after given
         new_node.next=prev_node.next;
         prev_node.next=new_node;
         
        }

}
