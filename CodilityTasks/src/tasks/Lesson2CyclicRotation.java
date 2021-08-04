/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Arrays;

/**
 *
 * @author Leand
 */
public class Lesson2CyclicRotation {

    public void test() {

        int[] array = new int[]{};
        System.out.println("Array: " + Arrays.toString(array));
        int rotation = 0;
        solution(array, rotation);
      
    }

    public int[] solution(int[] A, int K) {
        if (A.length==0){
            return A;
        }
        int[] arrayR = new int[A.length];
        int rot = 0;
        while (rot < K ) {
            arrayR[0] = A[A.length - 1];
            for (int i = 0; i < A.length - 1; i++) {
                arrayR[i + 1] = A[i];
            }
            A = Arrays.copyOf(arrayR, arrayR.length);
            rot++;
        }
        System.out.println("Array: " + Arrays.toString(A));
        return A;

    }
}
