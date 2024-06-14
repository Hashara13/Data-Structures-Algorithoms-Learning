/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Insertion_Sort {

    public static void Insertion_Sort(int[] arr) {
        int key;
        int i, j;

        for (i = 1; i < arr.length; i++) {
            key = arr[i];
            for (j = i; j > 0 && key < arr[j - 1]; j--) {
                arr[j] = arr[j - 1];
                arr[j] = key;
            }
        }

        // 02 method
        for(i=2;i<arr.length;i++){
             key = arr[i];
             j=i-1;
             while(i>0 && arr[i]>key){
                 arr[j+1]=arr[j];
                 j=j-1;
             }
             arr[j+1]=key;
        }
    }

}
