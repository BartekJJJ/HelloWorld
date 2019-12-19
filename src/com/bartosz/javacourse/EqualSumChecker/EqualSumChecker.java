package com.bartosz.javacourse.EqualSumChecker;

public class EqualSumChecker {
    public static boolean areEqual(int first, int second, int sum){
        int eoo = first + second;
        if(eoo == sum  ){
            return eoo == sum;
        }else
        return false;
    }
}
