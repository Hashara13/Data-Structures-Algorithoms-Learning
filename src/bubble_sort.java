/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class bubble_sort {

    public static void main(String[] args) {
        int A[];
        int i, j;
      

        for (i = 0; i < A.length; i++) {
            for (j = A.length - 1; j > i; j--) {
                if (A[j] < A[j - 1]) {
                    swap(A, j, j - 1);
                }
            }
        }
    }

}
