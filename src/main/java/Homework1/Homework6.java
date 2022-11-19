package Homework1;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write number betwneen 1 and 7:");
        double num = Double.parseDouble(scanner.nextLine());
        int numNew = (int)num;

            switch (numNew) {
                case 1:
                    System.out.println("monday");
                    break;
                case 2:
                    System.out.println("tuesday");
                    break;
                case 3:
                    System.out.println("wednesday");
                    break;
                case 4:
                    System.out.println("thursday");
                    break;
                case 5:
                    System.out.println("friday");
                    break;
                case 6:
                    System.out.println("saturday");
                    break;
                case 7:
                    System.out.println("sunday");
                    break;
                default:
                    System.out.println("Invalid number. Run again");
                    break;
            }
        }

    }
    /*Задача 6:
Да се въведе число от клавиатурата от 1 до 7
и да се изведе съобщение кой ден от седмицата отговаря на съответно число с подходящо съобщение*/


