package Homework2;

public class Homework4 {
    public static void main(String[] args) {
        int [] arr = {9, 19, 29, 39, 49, 59, 69, 79, 89, 99};

        //for
        System.out.println("Here is traverse of array using for loop: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //while
        int index = 0;
        System.out.println("\n\nHere is traverse of array using while: ");
        while (index < arr.length) {
            System.out.print(arr[index] + " ");
            index++;
        }
    }
    /*Задача 4
Напишете програма, която създава масив с 10 елемента от тип int и обходете масива:
1) с помоща на for loop
2) с помоща на while loop
Да се изведат елементите на екрана.*/
}
