package Homework1;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write for numbers - int, int, double, double:");
        int firstInt = Integer.parseInt(scanner.nextLine()); //5
        int secondInt = Integer.parseInt(scanner.nextLine()); //6
        double firstDouble = Double.parseDouble(scanner.nextLine()); //7.77
        double secondDouble = Double.parseDouble(scanner.nextLine()); //8.88
        System.out.printf("Your input numbers are: %d, %d, %.2f, %.2f \n", firstInt, secondInt, firstDouble, secondDouble);
        double sumInput = firstInt + secondInt + firstDouble + secondDouble;
        System.out.printf("Sum of all your input numbers: " + sumInput + "\n\n");
        /*две по две: (n1, n2), (n3, n4) изходни данни
        едно: (n2, n1), (n4, n3)
        две: (n4, n3, n2, n1)
        */

        int firstIntNewValue = (int) secondDouble;
        int secondIntNewValue = (int) firstDouble;
        double firstDoubleNewValue = (double)secondInt;
        double secondDoubleNewValue = (double)firstInt;
        System.out.printf("Your numbers with changed values: %d, %d, %.2f, %.2f \n", firstIntNewValue, secondIntNewValue, firstDoubleNewValue, secondDoubleNewValue);
        double sumChangedValue = firstIntNewValue + secondIntNewValue + firstDoubleNewValue + secondDoubleNewValue;
        System.out.printf("Sum of all numbers with changed values: " + sumChangedValue + "\n\n");

        double firstIntNewValueCastedToDouble = Math.toIntExact(Math.round(firstIntNewValue));
        double secondIntNewValueCastedToDouble = Math.toIntExact(Math.round(secondIntNewValue));
        double sumOfAllDouble = firstIntNewValueCastedToDouble + secondIntNewValueCastedToDouble + firstDoubleNewValue + secondDoubleNewValue;
        System.out.printf("Sum of all numbers casted to double: " + sumOfAllDouble +"\n\n");

        int firstDoubleNewValueCastedToInt = (int)firstDoubleNewValue;
        int secondDoubleNewValueCastedToInt = (int)secondDoubleNewValue;
        int sumOfAllInt = firstIntNewValue + secondIntNewValue + firstDoubleNewValueCastedToInt + secondDoubleNewValueCastedToInt;
        System.out.printf("Sum of all numbers casted to int: " + sumOfAllInt + "\n\n");
    }
    /*Задача 2:
Въведете 4 различни числа от конзолата и разменте стойността им две по две.
Нека числата бъдат от различен тип (int и duoble).
Разпечатайте новите им стойности.
Направете кастване (casting) конвертиране на числата веднъж от int to double
и после от double to int и след всяко конвертиране изведете сумата им
n1, n2, n3, n4
n3, n4, n1, n2
n2, n1, n4, n3
n4, n3, n2, n1
n2, n4, n1, n3
n2, n4, n3, n1
*/
}
