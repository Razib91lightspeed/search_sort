package FinalJavaProject;
import java.util.Scanner;

public class Search {
    private static final int[] array = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    static Scanner scanner = new Scanner(System.in);

    //this function finds certain value from the fixed array in linear search technic.
    private static int linearSearching(int[] array, int key) {
        for (int target : array) {
            if (target == key)
                return 1;
        }
        return -1;
    }

    public static void LinearSearching() {
        int[] arrayForSearching = new int[array.length];
        System.arraycopy(array, 0, arrayForSearching, 0, array.length);
        System.out.print("In the list are values 0, ..., 9; which value would you like to search with linear search? ");
        String input = scanner.next();
        int key = Integer.parseInt(input);
        System.out.println();

        int result = linearSearching(arrayForSearching, key);
        if (result == -1) System.out.println("Not found\n");
        else System.out.println("Found\n");
    }

    //this function finds certain value from the fixed array in Binary search technic.

    private static int binarySearching(int[] p, int item) {
        int low = 0, peak = p.length - 1;
        while (peak  - low > 1) {
            int mid = (peak  + low) / 2;
            if (p[mid] < item) {
                low = mid + 1;
            }
            else {
                peak  = mid;
            }
        }
        if (p[low] == item)
            return low;
        else if (p[peak ] == item)
            return peak ;
        return -1;
    }

    public static void BinarySearching() {
        int[] arrayForSearching = new int[array.length];
        System.arraycopy(array, 0, arrayForSearching, 0, array.length);

        System.out.print(" In the list are values 0, ..., 9;  which value would you like to search with binary search? ");
        String input = scanner.next();
        int clue = Integer.parseInt(input);
        System.out.println();

        int res = binarySearching(arrayForSearching, clue);
        if (res == -1) System.out.println(" Not found\n ");
        else System.out.println(" Found\n ");
    }
}
