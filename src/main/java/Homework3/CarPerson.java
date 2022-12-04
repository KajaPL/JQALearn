package Homework3;

import java.util.Scanner;

public class CarPerson {
    public static void main(String[] args) {
        Car infiniti = new Car();
        infiniti.year = 2015;
        infiniti.price = 55.555;
        infiniti.isSportCar=true;
        infiniti.fuelTankCapacity = 100;
        infiniti.freeFuel = 53;
        infiniti.engineFuelOperationSystem = "diesel";


        Car golf = new Car ();
        golf.year = 1995;
        golf.isSportCar=false;
        golf.fuelTankCapacity = 50;
        golf.price = 1.111;
        golf.freeFuel = 50;
        golf.engineFuelOperationSystem = "cng";
        golf.useFuel(35);

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPlease write new engine fuel. You can write for example - petrol, cng, electricity, biofuels:");
        String newEngineFuelOperationSystem = scanner.nextLine();
        infiniti.changeEngineFuelOperationSystem(newEngineFuelOperationSystem);

        System.out.println("\nPlease write a double num, which reduces free fuel:");
        double fuelChanged = Double.parseDouble(scanner.nextLine());
        golf.useFuel(fuelChanged);


        infiniti.printingCars();
        golf.printingCars();
    }

        /*Да се създаде клас CarPerson, с main метод.
В рамките на main метода да се създадат 2 обекта от тип Car.

Да се зададат стойности на всеки от колите за year, price,
fuelTankCapacity, freeFuel, engineFuelOperationSystem.

Нека едината кола да е спортна.

На едната от колата да е заделено 35 литра гориво (чрез
метода useFuel),

а на другия, да се смени горивната система (чрез
метода changeЕngineFuelOperationSystem),
*/
}
