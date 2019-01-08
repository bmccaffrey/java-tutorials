public class Search {

    public static void main(String[] args) {
        int[] a = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        System.out.println(linearSearch(a, 110));
        System.out.println(binarySearch(a, 20));
    }
    public static int linearSearch(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) { return i; }
        }
        return -1;
    }
    public static int binarySearch(int[] array, int element) {
        int half = array.length / 2;
        if (array[half] == element) { return half; }
        else if (array[half] < element) {
            for (int i = (half + 1); i < array.length; i++) {
                if (array[i] == element) { return i; }
            }
        }
        else {
            for (int i = (half - 1); i < array.length; i--) {
                if (array[i] == element) { return i; }
            }
        }
        return -1;
    }
}
