package com.practice.FastAndSlowPointers;

public class FindIfNumberIsHappyNumber {

    public static boolean isHappy(int num){
        int slowRunner = num;
        int fastRunner = num;


        while (fastRunner != 1 && calculateSumOfSquareOfDigits(fastRunner) != 1){

            slowRunner = calculateSumOfSquareOfDigits(slowRunner);
            fastRunner = calculateSumOfSquareOfDigits(fastRunner);
            fastRunner = calculateSumOfSquareOfDigits(fastRunner);

            if(fastRunner == slowRunner)
                return false;
        }


        return true;
    }

    private static int calculateSumOfSquareOfDigits(int num) {
        int sum = 0;
        while (num>0){
            sum += Math.pow(num%10, 2);
            num = num/10;
        }
        return sum;
    }
}
