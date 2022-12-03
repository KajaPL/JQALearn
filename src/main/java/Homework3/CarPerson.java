package Homework3;

public class CarPerson {
    public static void main(String[] args) {
        Car infiniti = new Car();
        infiniti.year = 2015;
        infiniti.price = 55.555;
        infiniti.isSportCar=true;
        infiniti.fuelTankCapacity = 100;
        infiniti.freeFuel = 10;
        infiniti.engineFuelOperationSystem = "Diesel";

        Car golf = new Car ();
        golf.year = 1995;
        golf.isSportCar=false;
        golf.fuelTankCapacity = 50;
        golf.price = 1.111;
        golf.freeFuel = 2;
        golf.engineFuelOperationSystem = "Gasoline";

    }

        /*Да се създаде клас CarPerson, с main метод.
В рамките на main метода да се създадат 2 обекта от тип Car.

Да се зададат стойности на всеки от колите за year, price,
fuelTankCapacity, freeFuel, engineFuelOperationSystem.Нека едината кола да е спортна. На едната от колата да е заделено 35 литра гориво (чрез
метода useFuel), а на другия, да се смени горивната система (чрез
метода changeЕngineFuelOperationSystem), след което да се изведат на екрана всичките полета на дете коли*/
}
