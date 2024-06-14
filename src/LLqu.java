/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class LLqu {

    /*class Node {

        int data;
        Node next;
        Node head;
    }

    public static void main(String[] args) {
        Node one = null;
        Node two = null;
        Node three = null;
        Node four = null;
        one = new Node();
        two = new Node();
        three = new Node();
        one.data = 10;
        two.data = 10;
        three.data = 10;
        one.next = two;
        two.next = three;
        three.next = null;

        head = one;
        while (head != null) {
            System.out.println(head.data + "");
            head = head.next;
        }
    }*/
    
    
        public static void main(String[] args) {
        LLL list=new LinkedList<>();
        list.insertEnd(4);
        list.insertFront(34);
          list.insertBetween(4);
           list.delete(4);
           list.show();
    }

}


class Node{
      
      Node next;
      int data;
}

class LLL{
    Node head;
  public static void insertEnd(int data){
          Node node1=new Node();
          node1.data=data;
          node1.next=null;
          
          if(head==null){
              head=node1;
          }
          else{
              Node node2=head;
              while(node2.next!=null){
                  node2=node2.next;
                  
              }
              node2.next=node1;
          }
      }
  
    public static void insertFront(int data){
          Node node1=new Node();
          node1.data=data;
          node1.next=null;
          node1.next=head;
          head=node1;
    }
    
      public static void insertBetween(int data, int index){
          Node node1=new Node();
          node1.data=data;
          node1.next=null;
          if(index==00){
              insertFront( data);
          }
          else{
              Node node2=head;
              for(int i=0;i<index-1;i++){
                  node2=node2.next;
                  node1.next=node2.next;
                  node2.next=node1;
              }
          }
    }
      
      public void delete(int index){
          if(index==0){
              head=head.next;
          }
          else{
              Node node2=head;
              Node node3=null;
              
              for(int i=0;i<index-1;i++){
                  node2=node2.next;
                  node3=node2.next;
                  node2.next=node3.next;
                  
              }
          }
      }
  
  public void show(){
    Node node1=head;
    while(node1.next!=null){
                  node1=node1.next;
    }
            System.out.println(node1.data);
}
  

}
    
