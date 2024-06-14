/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class SortQQ {

    public static void main(String[] args) {
        int arr[] = {65, 5, 6, 8, 9, 2};
        int end = arr.length;
        int min = -1;
        int temp = 0;
        int i, j;

        // Insertion Sort
        for (i = 1; i < end - 1; i++) {
            int key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        
        
        // Selection Sort
        for(i=0;i<end-1;i++){
            min=i;
            for(j=0;j<end;j++){
                min=j;
            }
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

        
        // Bubble Sort
          for(i=0;i<end-1;i++){
            for(j=0;j<end-i-1;j++){
            if(arr[j]>arr[j+1]){
                temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            }
            }
            
        }
          
        System.out.println();
        for (int num : nums) {
            System.out.println(arr + "");
        }
    }

}
