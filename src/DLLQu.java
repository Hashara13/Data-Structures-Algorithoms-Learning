/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */

class DBL{
int data;
Node head,tail;
public static void addEnd(int data){
Node temp=new Node(data);
if(head==null){ // if havent new node set to head & tail
head=tail=temp;}
else{
tail.next=temp; // if have exist tail next link to new
temp.prev=tail;
tail=one;
tail.next=null;}}

public void addFront(int value) {
Node temp = new Node(value);
if(head == null) {
head = temp;
tail = temp;
}
else { // if have exist head link to new
temp.next = head;
head.previous = temp;
head = temp;
}
}

public void print(){
Node now=this.head;
while(now!=null){
System.out.println(now.data+"");
now=now.data;}
System.out.println();}}
public class DLLQu {
public static void main(String[] args) {
DBL two=new DBL();
two.addEnd(5);
two.print(); }}
