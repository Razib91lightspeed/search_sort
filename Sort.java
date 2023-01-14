
package FinalJavaProject;

import java.util.Random;

public class Sort {
    static int[] array = new int[10];

    private static void createRandomArray(int[] array) {
        Random rd = new Random();
        //random array is generated between -99 to 99

        for (int i = 0; i < array.length; i++) {
            int max=99;
            int min=-99;
            array[i] = rd.nextInt(max-min+1)+min;
        }
    }

    //for loop to go through to find target for O(n^2) sorting

    public static void insertionSorting(int array[]) {
        int n = array.length;

        for (int j = 1; j < n; j++) {
            int key = array[j];
            int num = j-1;
            while ( (num  > -1) && ( array [num ] > key ) ) {
                array [num +1] = array [num ];
                num --;
            }
            array[num +1] = key;
        }
    }

    public static void InsertionSorting() {
        createRandomArray(array);

        System.out.println("Data set before insertion sorting:");
        for (int insertion : array)
            System.out.print(insertion + " ");
        System.out.println("\n");

        insertionSorting(array);

        System.out.println("Data set after insertion sorting:");
        for (int insertion: array)
            System.out.print(insertion + " ");
        System.out.println("\n");
    }

    //for loop to go through to find target for O(n*log(n)) sorting

    private static void Quicksort(int[] arr)
    {
        int L_size= arr.length;


        for (int split = L_size / 2 - 1;  split >= 0;  split--)
            quicksort(arr, L_size,  split);


        for (int  split = L_size - 1;  split > 0;  split--) {

            int temp = arr[0];
            arr[0] = arr[ split];
            arr[ split] = temp;


            quicksort(arr,  split, 0);
        }
    }


    private static void quicksort(int[] arr, int num, int i)
    {
        int max = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;


        if (left <  num && arr[left] > arr[max])
            max = left;


        if (right <  num && arr[right] > arr[max])
            max= right;


        if (max != i) {
            int swap = arr[i];
            arr[i] = arr[max];
            arr[max] = swap;


            quicksort(arr, num, max);
        }
    }

    public static void QuickSorting() {
        createRandomArray(array);

        System.out.println("Data set before quicksort:");
        for (int q_sort : array)
            System.out.print(q_sort  + " ");
        System.out.println("\n");

        Quicksort(array);

        System.out.println("Data set after quicksort:");
        for (int q_sort : array)
            System.out.print(q_sort  + " ");
        System.out.println("\n");
    }

}