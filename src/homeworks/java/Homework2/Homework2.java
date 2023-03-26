package Homework2;

import java.util.Scanner;

public class Homework2 {

    static float average(int firstNum, int secondNum) {
        float averageOfNums = (float)(firstNum + secondNum) / 2;
        return averageOfNums;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first int input num:");
        int firstNum = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter second int input num:");
        int secondNum = Integer.parseInt(scanner.nextLine());
        System.out.println("Arithmetic mean of your two input int nums is: " + average(firstNum, secondNum));
    }
    /*Задача 2
Да се състави метод, който приема като аргументи две числа
и връща тяхното средноаритметично.*/
}
