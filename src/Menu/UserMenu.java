package Menu;

import Lists.FlightList;

import java.util.Scanner;

public class UserMenu {
    FindFlightMenu findFlightMenu = new FindFlightMenu();
    FlightList flightList;
    Scanner sc = new Scanner(System.in);
    int choice;
    public UserMenu(FlightList flightList) {
        this.flightList = flightList;
    }
    public void menu(FlightList flights) {
        do {

            System.out.println("MENU");
            System.out.println("1. Znajdź lot");
            System.out.println("2. Kup bilet");
            System.out.println("3. Pokaż zakupione bilety");
            System.out.println("4. Zwróć bilet");
            System.out.println("5. Wyjdź");
            System.out.println("Wybierz numer");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    findFlightMenu.menu(flightList);
            }

        } while (choice != 5);
    }
}
