public class MegaBytesConverter {

    public static void main(String[] args) {
//        printMegaBytesAndKiloBytes(1024);
//        System.out.println(bark(true, 1));
//        System.out.println(bark(true, 10));
//        System.out.println(bark(false, 1));
//        System.out.println(bark(true, -1));

//        int num = 3;
//        System.out.println((double) num / 2);
//        System.out.println(num + 5d);
//        System.out.println((double) num);
//        double n = num;
//        System.out.println(n /2);
//        System.out.println((num /2) == (n /2));

//        System.out.println(isLeapYear(0)); // false
//        System.out.println(isLeapYear(10000)); // false
//        System.out.println(isLeapYear(1800)); // false
//        System.out.println(isLeapYear(2000)); // true
//        System.out.println(isLeapYear(2020)); // true
//        System.out.println(isLeapYear(1756)); // true

//        int x = 10;
//        int y = 15;
//        int z = 20;
//        if ((x > 5 && x < 15) && y >5 && z > 5) {
//            System.out.println("Greater than 5!");
//        }
//        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
//        System.out.println(areEqualByThreeDecimalPlaces(3.1479, 3.1467));
//        double x = 3.1756d;
//        System.out.println("x is supposed to be a double: " + (x * 1000));
////        x = (int)(x * 1000);
//        x = (x * 1000);
//        System.out.println(x);
//        x = (int) x;
//        System.out.println("y is supposed to be an int: " + x);
//        int y = (int) x;
//        System.out.println("y is supposed to be an int: " + y);
//        System.out.println(hasEqualSum(1,-1,0));
//        System.out.println(hasTeen(13,15,16));
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int mb = kiloBytes / 1024;
            int kb = kiloBytes - (mb * 1024);
            System.out.println(kiloBytes + " KB = " + mb + " MB and " + kb + " KB");
        }
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }
        return false;
    }

    public static boolean isLeapYear(int year) {
        if (year <= 1 || year >= 9999) {
            return false;
        }
        if ((year / 400) == ((double) year / 400)
        || (year / 4) == ((double) year / 4)
        && (year / 100) != ((double) year / 100)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        num1 = (int) (num1 * 1000);
        num2 = (int) (num2 * 1000);
        return (num1 == num2) ? true : false;
    }

    public static boolean hasEqualSum(int x, int y, int z) {
        return (x + y == z) ? true : false;
    }

    public static boolean hasTeen(int x, int y, int z) {
        return (x >= 13 && x <= 19) ? true
        : (y >= 13 && y <= 19) ? true
        : (z >= 13 && z <= 19) ? true
        : false;
    }
}
