/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author HP
 */

import java.util.LinkedList;
public class DSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         LinkedList<String> one=new LinkedList<String>();
        
        // add data
        one.add("zMy");
        one.add("My1");
        one.add("fMy2");
        one.add("My3");
        one.add("My4");
        
        // removean elemant
        one.remove(3);
        
         // sort elemants
        Collections.sort(one);
        
          //Add new value in Begining
        one.addFirst("Massrati");
        
        //Add new value in End
        one.addLast("Honda");
        
        //Remove value in Begining
        one.removeFirst();
        
        //Remove value in End
        one.removeLast();
        
        // change elemant value in an index
        one.set(2,"Ferrari");
        
        System.out.println(one);    
    }
    
}
