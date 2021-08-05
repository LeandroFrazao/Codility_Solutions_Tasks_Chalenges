/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Leand
 */
public class Lesson2OddOcurrencyInArray {

    public void test() {
        int[] array = new int[]{1,5,1};
        solution(array);
    }

    public int solution(int[] A) {
        //ArrayList<Integer> arrayL = new ArrayList<>(A.length);

        HashSet<Integer> setList = new HashSet<>();
       
        int oddNumber = 0;
      
        for (int value : A) {
            if (!setList.add(value)){
                setList.remove(value);
            }
        }
        for (int value:setList){
            oddNumber = value;
        }

// another solution;
//              int elem = 0;
//		for (int i = 0; i < A.length; i++) {
//			elem ^= A[i];
//		}
//        

//  only 55% on codility        
//Collections.sort(arrayL);
//        int oddNumber = 0;
//        if (arrayL.size() == 1) {
//            return arrayL.get(0);
//        }
//        int i = 0;
//        while (i < arrayL.size()) {
//            if (i + 1 == arrayL.size()) {
//                oddNumber = arrayL.get(i);
//                break;
//            }
//            if (arrayL.get(i) != arrayL.get(i + 1)) {
//                oddNumber = arrayL.get(i);
//                break;
//            }
//            i += 2;
//        }

//        while (i < arrayL.size()) {
//            for (int j = i + 1; j <= arrayL.size() - 1; j++) {
//                if (arrayL.get(i) == arrayL.get(j)) {
//                    arrayL.remove(j);
//                    arrayL.remove(i);
//                    i = -1;
//                    break;
//                }
//            }
//            i++;
//        }
        return oddNumber;
    }
}
