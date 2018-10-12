package com.company;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
////        (value == 3) ? System.out.println("Value was 1") : System.out.println("Value was 2");
//        if (value == 3) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
//        System.out.println("Value was 1");
//        System.out.println("Value was 2");
//        System.out.println("Was not 1 or 2");

//        Only works w/ byte, short, char, & int;
        int switchValue = 4;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("This is painful");
                break;
            default:
                System.out.println("Was not 1 or 2");

        }

        // RIP Java 6
        String month = "June";
        switch(month) {
            case "May":
                System.out.println("May");
                break;
            case "June":
                System.out.println("June");
                break;
            default:
                System.out.println("something else");
        }



    }
}
