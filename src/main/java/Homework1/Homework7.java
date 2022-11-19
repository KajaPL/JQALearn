package Homework1;

public class Homework7 {
    public static void main(String[] args) {
        System.out.println("Hey, I'll print for you numbers from 1 to 100 without numbers from 54 to 74. Enjoy!");
        for (int i = 1; i <=100; i++) {
            if (i >=54 && i <= 74) {
                continue;
                //System.out.println(i);
            }
            System.out.println(i);
        }
    }
    /*Задача 7:
Да се изведат числата от 1 до 100 без числата от 54 до 74.
След извършените операции да се отпечатат получените резултати. (hint - continue) */
}
