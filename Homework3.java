package Homework1;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey please write first integer number:");
        double firstNum = Double.parseDouble(scanner.nextLine());
        System.out.println("Hey please write second integer number:");
        double secondNum = Double.parseDouble(scanner.nextLine());
        System.out.println("Hey please write third integer number:");
        double thirdNum = Double.parseDouble(scanner.nextLine());

        int firstNumCasted = (int)firstNum;//5 -5
        int secondNumCasted = (int)secondNum;//6 -15
        int thirdNumCasted = (int)thirdNum;//7 -30

        int firstNumNew = secondNumCasted;//6 -15
        int secondNumNew = thirdNumCasted;//7 -30
        int thirdNumNew = firstNumCasted;//5 -5

        int sumOfFirstAndSecond = firstNumNew + secondNumNew;//13 -45

        int sumAll = sumOfFirstAndSecond - thirdNumNew;//13-5=8 -45 - -5 = -45 +5 = -40

        System.out.printf("The diff is: %d", Math.abs(sumAll)); //8 40
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
