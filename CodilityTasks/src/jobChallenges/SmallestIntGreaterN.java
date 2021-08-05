/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobChallenges;

/**
 *
 * @author Leand
 */
public class SmallestIntGreaterN {

    public void test() {
        int N = 500;
        System.out.println("The smallest integer greater than N = " + N);
        System.out.println("Which the sum of  whose digit is twice big as the sum of digits of N= " + N);
        System.out.println("Is --> " + solution(N));
    }

    public int solution(int N) {
        int smallest = 0;
        int doubleSum = sumDigits(N) * 2;
        int i = N;
        while (true) {
            int sum = sumDigits(i);
            if (sum == doubleSum  ) {
                smallest = i;
                break;
            }
            i++;
        }
        return smallest;
    }

    //recursion to sum digits
    public static int sumDigits(int k) {
        if (k > 0) {
            int i = k;
            k = k % 10;
            return k + sumDigits(i / 10);
        }
        return 0;
    }
//    static int getSum(int n) {
//        int sum = 0;
//        while (n != 0) {
//            sum = sum + n % 10;
//            n = n / 10;
//        }
//        return sum;
//    }
    
    
    
// another Job task      
//        int K = 2;
//        int[] A = new int[]{1, 1, 3};
//        
//        int n = A.length;
//        for (int i = 0; i < n-1; i++) {
//            if (A[i]+1 <= A[i+1]) {
//                System.out.println("false");
//            }
//        }
//        if (A[0] != 1 && A[n - 1] != K) {
//            System.out.println("false");
//        } else {
//            System.out.println("true");
//        }
//another job task
//       Set<Integer> uniqueCandies = new LinkedHashSet<Integer>();
//for(int value : A) {
//    uniqueCandies.add(value);
//}    
    
}
