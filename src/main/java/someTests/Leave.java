package someTests;

import java.util.Scanner;

public class Leave {
    public static void main(String[] args) {
        System.out.println("Hey! Can I take home office this friday? Type Y / N.");
        Scanner scanner = new Scanner(System.in);
        String yesOrNoHO = scanner.next();
        System.out.println("Can I take paid leave - half on this thursday afternoon and half on monday afternoon?");
        String yesOrNoLeave = scanner.next();

        if ((yesOrNoHO.equalsIgnoreCase("N")) || (yesOrNoLeave.equalsIgnoreCase("N"))) {
            System.out.println(":cryalot: emoji");
        } else if ((yesOrNoHO.equalsIgnoreCase("Y")) || (yesOrNoLeave.equalsIgnoreCase("Y"))) {
            System.out.println("Thank youuu!");
        } else {
            System.out.println("Run again");
        }

    }
}
