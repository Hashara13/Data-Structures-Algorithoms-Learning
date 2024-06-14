/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.*;

public class DoubleLL {
    
    static class Node3{
        public void push(int data){
        Node node1=new Node(data); 
        
        //Make NOde pointers
        node1.next=head;
        node1.prev=null;
        
        // change prev node
        if(head!=null){
            head.prev=node1;
            head=node1;
        }
    }
   
        
    }
    
}
