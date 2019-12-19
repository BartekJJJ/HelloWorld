package com.bartosz.javacourse.BarkingDog;

public class BarkingTest {
    public static void main(String[] args) {
      boolean what =  BarkingDog.shouldWakeUp(true,1);
        System.out.println(what);
       boolean what1= BarkingDog.shouldWakeUp(false,2);
        System.out.println(what1);

        boolean what2=BarkingDog.shouldWakeUp(true,0);
        System.out.println(what2);

        boolean what3= BarkingDog.shouldWakeUp(true,23);
        System.out.println(what3);

    }
}
