package Homework6;

public class AnimalDemo {
    public static void main(String[] args) {
        //bird
        Bird sparrow = new Bird(1, "gray", "Wrobelek");
        System.out.println("\nMy name is " + sparrow.nameOfAnimal + ", my feathers color is " + sparrow.colorOfAnimal + " and I'm already " + sparrow.age + " year old!");
        sparrow.makeSomeNoise();
        sparrow.sing(5);
        sparrow.play();
        sparrow.fly();

        //cat
        Cat wildCat = new Cat(5, "black", "Mruczek");
        System.out.println("\nMy name is " + wildCat.nameOfAnimal + ", my feathers color is " + wildCat.colorOfAnimal + " and I'm already " + wildCat.age + " year old!");
        wildCat.makeSomeNoise();
        wildCat.play();
        wildCat.climb();

        Dog homeDog = new Dog(2, "caramel", "Argos");
        System.out.println("\nMy name is " + homeDog.nameOfAnimal + ", my feathers color is " + homeDog.colorOfAnimal + " and I'm already " + homeDog.age + " year old!");
        homeDog.makeSomeNoise();
        homeDog.play();
        homeDog.bringStick();

        /*
        someTest people = new someTest(35, "blonde", "Kaja");
        people.makeSomeNoise();
        people.play();
        */
    }
}
/*Да се създаде един демонстративен клас
AnimalDemo с main метод,
в който се създават по един обект от всеки вид животно
и се демонстрират разликите в методите play() и makeSomeNoise()*/
