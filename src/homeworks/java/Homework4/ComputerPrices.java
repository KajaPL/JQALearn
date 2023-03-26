package Homework4;

public class ComputerPrices {
    public static void main(String[] args) {
        Computer firstLaptop = new Computer(2008, "macOS Tiger");
        firstLaptop.price = 999.99;

        Computer secondLaptop = new Computer(2022, 1199.99,"macOS Ventura");

        System.out.println(secondLaptop.comparePrice(firstLaptop));
    }
}
