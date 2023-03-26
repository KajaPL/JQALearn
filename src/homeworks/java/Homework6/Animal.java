package Homework6;

abstract class Animal {
    int age;
    String colorOfAnimal;
    String nameOfAnimal;
    public Animal (int age, String colorOfAnimal, String nameOfAnimal) {
        this.age = age;
        this.colorOfAnimal = colorOfAnimal;
        this.nameOfAnimal = nameOfAnimal;
    }
    public void play() {
        System.out.println("testing noise");
    }
}
class Bird extends Animal implements IAnimal {

    public Bird(int age, String colorOfAnimal, String nameOfAnimal) {
        super(age, colorOfAnimal, nameOfAnimal);
    }
    @Override
    public void makeSomeNoise() {
        System.out.println("Birds in polish sing ćwir, so I sing this song to you:");
    }

    @Override
    public void play() {
        System.out.println("\nBird swings on a branch");

    }
    public void fly() {
        System.out.println("Bird flies to bird feeder on my balcony");
    }

    public void sing(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print("ćwir ");
        }

    }


}

class Cat extends Animal implements  IAnimal {

    public Cat(int age, String colorOfAnimal, String nameOfAnimal) {
        super(age, colorOfAnimal, nameOfAnimal);
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Cats in polish say miauuu");
    }

    @Override
    public void play() {
        System.out.println("Cats love to play with mouses.");
    }

    public void climb() {
        System.out.println("Wild city cats love climb on the trees!");
    }
}

class Dog extends Animal implements IAnimal {

    public Dog(int age, String colorOfAnimal, String nameOfAnimal) {
        super(age, colorOfAnimal, nameOfAnimal);
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Dogs in polish say hau hau hau");
    }
    @Override
    public void play() {
        System.out.println("Dogs love to run in the city park or in the forest");
    }
    public void bringStick() {
        System.out.println("Dogs run ahead, smell the grass for a moment and bring back the stick.");
    }
}
/*class someTest extends Animal implements IAnimal {

    public someTest(int age, String colorOfAnimal, String nameOfAnimal) {
        super(age, colorOfAnimal, nameOfAnimal);
    }

    public void makeSomeNoise() {

    }

    @Override
    public void play() {
        super.play();
    }
}*/

/*Да се създаде абстрактен клас Animal
с общи черти за всички животни помислете внимателно.
Hint: нека да има общ метод play()
затова как играят различните животни

Да се създадат 3 събкласа Bird,Cat и Dog
които наследяват клас Animal,
съответно имат специфични методи
и овъррайдват общите за parent класа

Допълнителни методи в клас:
Bird - fly(), sing() - като метода sing
може да се овърлоудва според броя птички,
които имаме например при 2 птички звука е по-силен
Cat - climb()
Dog - bringStick()

*/