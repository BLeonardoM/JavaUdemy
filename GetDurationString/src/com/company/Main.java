package com.company;

import java.io.Serializable;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));

    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0 || seconds > 60)) {

            return "Invalid Parameter";
        }
        int hours = minutes / 60;
        int minute = minutes % 60;

        String hoursString = hours + "h";
        if(hours < 10 ){
            hoursString = "0" + hoursString;
        }

        return  hours + "h " + minute + "m " + seconds + "s ";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {

            return "Invalid Parameter";
        }
        int calcMinute = seconds / 60;
        int calcRemaiSec = seconds % 60;

        return getDurationString(calcMinute, calcRemaiSec);


    }
}
