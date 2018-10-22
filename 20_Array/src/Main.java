public class Main {

    public static void main(String[] args) {
        int[] myArray = new int[3];
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        System.out.println("There elements in 'myArray' are: " + myArray[0] + ", " + myArray[1]  + ", " + myArray[2] + ".");
        int[] myIntArray = {1, 2, 3, 4, 5};
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.print(myIntArray[i]);
        }
        System.out.println("");
        int[] anotherArray = new int[3];
        for (int i = 0; i < anotherArray.length; i++) {
            anotherArray[i] = 10 * i;
            System.out.println(anotherArray[i]);
        }
        printArray(myArray);
        printArray(myIntArray);
        printArray(anotherArray);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index: " + i + ", " + "value: " + array[i]);
        }
    }
}