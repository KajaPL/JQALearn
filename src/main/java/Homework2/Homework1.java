package Homework2;

import java.util.Scanner;

public class Homework1 {
    static int sumOfTwoInputNums(int firstNum, int secondNum){
    int sumOfNums = firstNum + secondNum;
    return sumOfNums;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first int input num:");
        int firstNum = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter second int input num:");
        int secondNum = Integer.parseInt(scanner.nextLine());
        System.out.println("Sum of your two input int nums is: " + sumOfTwoInputNums(firstNum, secondNum));
        //when you write in () it is already without int
    }

    /*Задача 1:
Да се състави метод, който приема като аргументи две числа
и отпечатва на екрана техния сбор.*/
}
