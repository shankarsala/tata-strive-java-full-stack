package yt_new.array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Initialize the array
        int[] numbers = new int[5];
        System.out.println("Enter " + numbers.length + " integers:");

        // CORRECT: Use a standard indexed loop to modify the array elements directly
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 2. Use a for-each loop to read/print the stored data
        System.out.println("\nHere are the numbers you entered:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}


//note : Taking input using for each not possible