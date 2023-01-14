package FinalJavaProject;

import java.util.Scanner;

public class PL3_Final_Project_Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean quit = false;

        while (!quit) {
            // Menu
            System.out.println("Menu of Searching and Sorting Testbed: \n");
            System.out.println("1)  Linear searching");
            System.out.println("2)  Binary searching");
            System.out.println("3)  O(n^2) type of sorting");
            System.out.println("4)  O(n*log(n)) type of sorting ");
            System.out.println("5)  Sorting Performance\n\n");
            System.out.println("q/Q)  QUIT \n");
            System.out.print("YOUR CHOICE: ");
            char userInput = scanner.next().charAt(0);
            System.out.println();


            //user input switch
            switch (userInput) {
                case '1' -> Search.LinearSearching();
                case '2' -> Search.BinarySearching();
                case '3' -> Sort.InsertionSorting();
                case '4' -> Sort.QuickSorting();
                case '5' -> Sort_Performance.SortingPerformanceToString();
                case 'q', 'Q' -> quit = true;
                default -> System.out.println("Not fond");
            }
        }

    }
}