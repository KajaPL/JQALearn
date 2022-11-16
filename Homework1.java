package Homework1;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey please write one integer number:");
        double firstDouble = Double.parseDouble(scanner.nextLine());
        int firstDoubleCasted = (int)firstDouble;
        System.out.printf("Your input int number is: %d \n", firstDoubleCasted);
        System.out.println("... and some double number:");
        double secondDouble = Double.parseDouble(scanner.nextLine());
        System.out.printf("Your input double number is: %.2f \n", secondDouble);
        System.out.println("Please write one more number:");
        double thirdDouble = Double.parseDouble(scanner.nextLine());

        int secondDoubleCasted = (int)secondDouble;
        int thirdDoubleCasted = (int)thirdDouble;

        if (thirdDoubleCasted >= firstDoubleCasted && thirdDoubleCasted <= secondDoubleCasted) {
            System.out.println("Your last input number is between first and second input numbers!");
        } else {
            System.out.println("Oh no! Your last input number is NOT between first and second input numbers!");
        }
    }
    /*Задача 1:
    Да се изпишат подканващи съобщения към user, с които да въведе две числа от клавиатурата (тип int или double).
    След всяко въвеждане числата да бъдат отпечатени с подходящ текст.
    Да се въведе и 3-то число като се провери дали то е между първото и второто, като се изведе подходящо съобщение.*/
}
