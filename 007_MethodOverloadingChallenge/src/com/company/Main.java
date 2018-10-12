package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(0, 0));
//        System.out.println(getDurationString(3660));
        // write your code here
    }

    public static String getDurationString(int minutes, int seconds) {
        String dateString = "";

        int hours = (minutes >= 60) ? (minutes / 60) : 0;
        minutes = (hours > 0) ? (minutes % 60) : minutes;

        dateString += (hours < 10) ? ("0" + hours) : hours;
        dateString += "h ";
        dateString += (minutes < 10) ? ("0" + minutes) : minutes;
        dateString += "m ";
        dateString += (seconds < 10) ? ("0" + seconds) : (seconds);
        dateString += "s";

        if ((minutes < 0) && ((seconds < 0) || (seconds > 59))) {
            return "Invalid Value";
        } else {
            return dateString;

        }
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            seconds = (minutes > 0) ? (seconds % 60) : seconds;
            return getDurationString(minutes, seconds);
        } else {
            return "Invalid value";
        }
    }
}
