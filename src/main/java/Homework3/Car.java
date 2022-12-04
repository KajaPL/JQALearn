package Homework3;

public class Car {
    int year;
    double price;
    boolean isSportCar;
    int fuelTankCapacity;
    double freeFuel;
    String engineFuelOperationSystem;

    public void changeEngineFuelOperationSystem(String newEngineFuelOperationSystem){
    engineFuelOperationSystem = newEngineFuelOperationSystem;
    System.out.println("System changed to: " + engineFuelOperationSystem);
    //infiniti
    }

    public void useFuel(double fuel){
         /*There are two options to consider how it should work:
        a)we have free fuel 50, minus 35, left 15. I'll reduce by 16, so it is -1. So I'll reduce and write zero, because can't be -1 or;
        b)we have free fuel 50, minus 35, left 15. I'll reduce by 16, so it is -1. So I'll not reduce at all, because can't be -1
        I choose b) option */
    if (this.freeFuel < fuel) {
        //freeFuel = 0;
        System.out.println("Not enough free fuel!");
    } else {
        freeFuel = freeFuel - fuel;
        System.out.printf("Free fuel changed to: %.2f\n", freeFuel);
    }
    //golf
    }

    public void printingCars () {

    System.out.printf("\n\nManufactured date: %d \nPrice is: %.3f \nThis is sport car: %b" +
            "\nFuel tank capacity is: %d \nFree fuel is: %.2f \nEngine fuel operations system is: %s"
            , year, price, isSportCar, fuelTankCapacity, freeFuel, engineFuelOperationSystem);

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
