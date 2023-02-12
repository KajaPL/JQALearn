package Homework5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class DemoMain {
    public static void main(String[] args) {
        Person[] humans = new Person[9];
        humans[0] = new Person("Justyna", 61, false);
        humans[1] = new Person("Kacper", 33, true);
        humans[2] = new Student("Kasjan", 32, true, 3.55);
        humans[3] = new Student("Angelika", 33, false, 4.55);
        humans[4] = new Employee("Mitko", 50, true, 66.66);
        humans[5] = new Employee("Iga", 6, false, 99.99);
        /* There was error NullPointerException, because array is 10, but items are 6, and four are null.
        So in length I made minus 4... */

        for (int i = 0; i <= humans.length-4; i++) {
            if (humans[i].getClass().getName().contains("Person")) {
                humans[i].showPersonInfo();
            } else if (humans[i].getClass().getName().contains("Student")) {
                ((Student) humans[i]).showStudentInfo();

            } else if (humans[i].getClass().getName().contains("Employee")) {
                ((Employee) humans[i]).showEmployeeInfo();
                ((Employee) humans[i]).calculateOvertime();
            }
        }

    }
}


/*Да се напише и демонстративен клас с main метод в който:
1. Да се състави масив от 10 елемента от тип Person.
2. Да се създадът по два обекта от тип Person, Student и Employee
и да се вкарат в масива от хора.
3. Да се обходим масива и в зависимост от това дали обекта е от
тип Person, Student или Employee да се извика съответно метода
showPersonInfo, showStudentInfo или showEmployeeInfo.
4. Да се обходи още веднъж масива с хора и за всеки човек, който
е работник, да се изведе на екрана сумата, която му се дължи при
2 часа работа извън работно време.*/
