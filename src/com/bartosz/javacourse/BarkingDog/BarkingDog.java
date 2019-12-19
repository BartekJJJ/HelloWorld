package com.bartosz.javacourse.BarkingDog;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {


        if (hourOfDay < 8 && hourOfDay >= 0 && barking == true) {
            return true;
        } else if (hourOfDay < 22 && hourOfDay > 23 && barking == false) {
            return false;
        } else if(hourOfDay >22 && hourOfDay < 24 && barking ==true){
            return true;
        }else   return false;

    }
}
