/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import challenges.Challenge_2018_10_Krypton2018;
import jobChallenges.SmallestIntGreaterN;
import tasks.Lesson1BinaryGap;
import tasks.Lesson2CyclicRotation;
import tasks.*;

/**
 *
 * @author Leand
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Lesson1BinaryGap TBinaryGap = new Lesson1BinaryGap();
        //  TBinaryGap.BinaryGap();

        Lesson2CyclicRotation TCyclicRotation = new Lesson2CyclicRotation();
        //  TCyclicRotation.test();

        Lesson2OddOcurrencyInArray TOddOcurrency = new Lesson2OddOcurrencyInArray();
          TOddOcurrency.test();

        // job task
       // SmallestIntGreaterN smallestIntGreaterN = new SmallestIntGreaterN();
       // smallestIntGreaterN.test();
        
// Challenge_2018_10_Krypton2018 C2018Krypton = new Challenge_2018_10_Krypton2018();
//        int[][] A = new int[][]{{1, 2, 3}, {10, 1,1 }, {1, 1, 20}};
//        System.out.println(C2018Krypton.solution(A));
    }

}
