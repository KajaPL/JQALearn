package Homework2;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println("Here is solution using \n --- clone() ---");
    int[] intialArr = {10, 12, 1, 8, 4};
    int[] clonedArr = intialArr.clone();
    System.out.println("Elements in initial array are: ");
        for (int i = 0; i < intialArr.length; i++) {
            System.out.print(intialArr[i] + " ");
        }

        System.out.println("\nElements in cloned array are: ");
        for (int i = 0; i < clonedArr.length; i++) {
            System.out.print(intialArr[i] + " ");
        }

        System.out.println("\n\n\nHere is faster solution using \n --- System.arraycopy() ---");
    int [] initArr =  {10, 12, 1, 8, 4};
    int[] copiedArr = new int[initArr.length];
    System.arraycopy(initArr, 0, copiedArr, 0, 5);
        //from where, start position, to where, dest postion, length
    System.out.println("Elements in initial array are: ");
        for (int i = 0; i < initArr.length; i++) {
            System.out.print(initArr[i] + " ");
        }
    System.out.println("\nElements in copied array are: ");
        for (int i = 0; i < copiedArr.length; i++) {
            System.out.print(initArr[i] + " ");
        }
    }
    /*Задача 5
Да се състави масив със следните стойности {10 12 1 8 4}.
След създаването на масива да се копират стойностите в нов масив*/
}
