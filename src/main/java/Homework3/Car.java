package Homework3;

public class Car {
    int year;
    double price;
    boolean isSportCar;
    int fuelTankCapacity;
    double freeFuel;
    String engineFuelOperationSystem;

public void changeEngineFuelOperationSystem(String newEngineFuelOperationSystem){
    this.engineFuelOperationSystem = newEngineFuelOperationSystem;
    System.out.println("System changed to: " + engineFuelOperationSystem);
    }

public void useFuel(double fuel){
    if (this.freeFuel < fuel) {
        System.out.println("Not enough free fuel!");
    } else {
        this.freeFuel = freeFuel - fuel;
        System.out.println("Free fuel changed to:" + this.freeFuel);
    }
}

public void printingCars () {
    System.out.println("\n\nManufactured date: " + year
            + "\nPrice is: " + price
            + "\nThis is sport car: " + isSportCar
            + "\nFuel tank capacity is:" + fuelTankCapacity
            + "\nFree fuel is:" + freeFuel
            + "\nEngine fuel operations system is:" + engineFuelOperationSystem);
}

/*Създайте клас Car, който представя кола.
Класът да има следните полета:

year – числова стойност показваща година на производство на
колата
price – числова стойност (не е задължително да е цяло число) показваща
цената на колата
isSportCar – булева стойност – дали колата е спортна или не
fuelTankCapacity – числова стойност за размера на резервоара
freeFuel – числова стойност показваща наличното свободно гориво
engineFuelOperationSystem – текстово поле за вида гориво,което използва автомобила

Класът да дефинира следните методи:
-метод void changeЕngineFuelOperationSystem(String newЕngineFuelOperationSystem), който сменя
стойността на полето engineFuelOperationSystem със стойността подадена като параметър.

-метод void useFuel(double fuel), който намалява свободното гориво
(freeFuel) със стойността подадена като аргумент.

Ако стойността на аргумента е по-голяма от наличното гориво, извеждa
съобщение "Not enough free fuel!"

след което да се изведат на екрана всичките полета на дете коли*/
}
