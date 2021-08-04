/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Scanner;

/**
 *
 * @author Leand
 */
public class Lesson1BinaryGap {

    public void BinaryGap() {

        System.out.println("Type a number: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("The longest Binary Gap is: " + CheckBinaryGap(number));
    }
    public int CheckBinaryGap(int number){
        String binaryStr = Integer.toBinaryString(number);
        int longestBinaryGap = 0, binaryGap = 0;
        for (int i = 0; i <= binaryStr.length() - 1; i++) {
            if (binaryStr.charAt(i) == "1".charAt(0)) {
                if (binaryGap > longestBinaryGap) {
                    longestBinaryGap = binaryGap;   
                }
                binaryGap = 0;
            } else if (binaryStr.charAt(i) == "0".charAt(0)) {
                binaryGap++;
            }
        }
        return longestBinaryGap;
    }
}
