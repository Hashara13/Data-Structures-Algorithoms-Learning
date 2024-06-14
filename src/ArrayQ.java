/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class ArrayQ {

    // Traversal : print array elements
    public static void traversal(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
    }

    //Insertion : add element to particular index
    public static void insert(int[] arr, int index, int element) {

        // check index validity
        if (index < 0 || index > arr.length) {
            System.out.println("invalid");
            return;
        }

        // shift right to insert new element
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        // add to new elemant
        arr[index] = element;
    }

    
    //Deletion: Delete element to particular index
    public static void delete(int[] arr, int index) {

        // check index validity
        if (index < 0 || index > arr.length) {
            System.out.println("invalid");
            return;
        }

        // shift left to remove element
        for (int i = index; i < arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }

        // set last elemant as 0
        arr[arr.length-1] = 0;
    }
    
    //Updating: update element in particular index
    public static void update(int[] arr, int index, int element) {

        // update to new elemant
        arr[index] = element;
    }
    
    //Searching: Search element in given index
    public static int search(int[] arr,int element) {

       // search the elemant
       for(int i=0;i<arr.length;i++){
          if( arr[i]==element){
        return i; // elemant found
        
    }   
       }
     return -1;// elemant not found
    }
    
    
    public static void main(String[] args) {
        int[] myArray = {1, 2, 5, 6, 8, 5};

        // check Traversal function
        traversal(myArray);
        // check insert function
        insert(myArray, 60, 2);
        // check delete function
        delete(myArray, 60);
        // check update function
        update(myArray, 60, 2);
        // check search function
        int place=search(myArray,2);
        if(place!=-1){
            System.out.println("element at index "+place);
        }
        else{
           System.out.println("element not  found "); 
        }        


        // print
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i] + "");
        }

    }
}
