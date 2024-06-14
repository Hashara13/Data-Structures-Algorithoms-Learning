/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class selection_sort {

    public static void selectionSort(int[] A) {
        int i, j, least;
        for (i = 0; i < A.length - 1; i++) {
            least = i;
            for (j = i + 1; j < A.length; j++) {
                if (A[j] < A[least]) {
                    least = j;
                }
            }
            if (i != least) {
                swap(A, least, i);
            }
        }
    }
}
