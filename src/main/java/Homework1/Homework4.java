package Homework1;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter int number for working hours:");
    int workingHours = Integer.parseInt(scanner.nextLine()); // for what is that if not used?
    System.out.println("Please enter double number for money:");
    double amountMoney = Double.parseDouble(scanner.nextLine());
    System.out.println("Please write True for working day and False for weekend:");
    boolean isWorkingDay = Boolean.parseBoolean(scanner.nextLine());

        if (!isWorkingDay) {
            if (amountMoney > 0 && amountMoney < 10) {
                System.out.println("I'll go for the icecream");//done
            } else if (amountMoney >= 10) {
                System.out.println("I'll go to the cinema");//done
            } else {
           System.out.println("No money, I'll stay at home watching TV");//done
            }
        } else {
            System.out.println("I should go to work!");//done
        }
    }
    /*Задача 4:
Въведете 3 променливи от клавиатурата – брой работни часове (целочислен тип),
сума пари (число с плаваща запетая),
дали е почивен ден – булев тип.
Съставете програма, която взема решения на базата на тези данни по следния начин:
done- ако не е почивен ден ще работя

- ако имам пари и е почивен ден ще отида на кино
- ако нямам – ще стоя вкъщи и ще гледам телевизия
- ако е почивен ден ако имам по-малко от 10 лв ще отида за сладолед*/
}
