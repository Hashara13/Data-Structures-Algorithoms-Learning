/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class DLL {

    // ADD FRONT IN THE LIST
    
    /*create node class to represent a node of the DLL
    class Node{
        int data;
        Node prev;
        Node next;
        
        public Node(int data){
            this.data=data;
        }
    }
        // set node3 head & tail to null
        Node head,tail=null;
        
        // add node to list
        public void addNode(int data){
            Node node1=new Node(data);
            
            // check for empty list
            if (head==null){
                
                //haed & tail point to new node
                head=tail=node1;
                
                // head's prev & tail's next point to null
                head.prev=tail.next=null;
            }
            
            else{
                // exist new node point to tail and new node prev point to tail
                tail.next=node1;
                node1.prev=tail;
                tail=node1;
                tail.next=null;
            }
        }
        
        public void show(){
            
            //current node point to head
            Node current=head;
            if(head==null){
                System.out.println("List is rmpty");
                return;
            }
            
            while(current!=null){
                System.out.println(current.data+"");
                current=current.next;
            }
        }
        public static void main(String[] args) {
            DLL DLlist=new DLL();
            DLlist.addNode(10);
            DLlist.addNode(20);
            DLlist.addNode(30);
            
            DLlist.show();
        }*/
    
    
    // ADD BETWEEN TWO NODES
    class Node{
        int data;
        Node prev,next;
        Node one;
        public Node(Node one, int data){
            this.one=one;
            this.data=data;
        }
    }
        public void insertNew(Node one,int data){
            Node two=new Node(one,data);
            
            two.next= one.next;
            one.next=two;
            two.prev=one;
            
            if(two.next!=null){
                two.next.prev=two;
        }
    }
        
        public void show(){
             Node now=head;
            while(now!=null){
                System.out.println(now.data+"");
                now=now.next;
            }
        } 
}
