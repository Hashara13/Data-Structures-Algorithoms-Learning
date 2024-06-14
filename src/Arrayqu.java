/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Arrayqu {

    //insertion
    public static void insertion(int arr[], int data, int index) {
        int myarr[]={5,6,1,4};
        // check for index available
        if (index < 0 || index < arr.length) {
            System.out.println("Invalid");
        }
        //shift data left
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = data;

        insertion(myarr, 2, 52);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
    }

    // Deletion
    public static void deletion(int arr[], int index) {
        int myarr[]={5,6,1,4};
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;

        deletion(myarr, 2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
    }
    
    //searching
    public static int search(int arr[], int data){
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]==data){
               return i;
           }
        }
        return -1;
    }
    
    public static void main(String[] args) {
      int index=serach(myarr,6);
    if(index!=-1){
            System.out.println("index found"+index);
}
    else{
                System.out.println("index not found");

}  
    }
    
}
