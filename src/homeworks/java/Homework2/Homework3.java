package Homework2;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];

        System.out.println("Enter five input int nums:");
        for (int i = 0; i < array.length ; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
   //you can also use i <= 4 instead of array.length

        System.out.println("Stored in array your input int nums are:");
        for (int i = 0; i <=array.length-1; i++) {
            System.out.print(array[i] + " ");
        }
    }
    /*Задача 3
Да се прочете масив от екрана с 5 числа по избор от тип double
и да се отпечатат всички резултати*/
}
