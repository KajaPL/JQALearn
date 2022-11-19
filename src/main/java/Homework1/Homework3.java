package Homework1;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        //test1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey please write first integer number:");
        int firstNum = Integer.parseInt(scanner.nextLine()); //5 -5
        System.out.println("Hey please write second integer number:");
        int secondNum = Integer.parseInt(scanner.nextLine()); //6 -15
        System.out.println("Hey please write third integer number:");
        int thirdNum = Integer.parseInt(scanner.nextLine()); // 7 -30

        int sumOfFirstAndSecond = secondNum + thirdNum;//13 -45

        int sumAll = sumOfFirstAndSecond - firstNum;//13-5=8 -45 - -5 = -45 +5 = -40

        System.out.printf("The diff is: %d", sumAll); //8 -40
    }
    /*Задача 3:
Въведете 3 числа от клавиатурата ч1, ч2 и ч3.

Разменете стойностите им така, че ч1 да има стойността на ч2,
ч2 да има стойността на ч3,
а ч3 да има старатастойност на ч1.

Съберете ч1 и ч2 и

след това намерете разликата между получения сбор и ч3.

!what this mean: Разпечатете стойностите на числата на етапи*/
}
