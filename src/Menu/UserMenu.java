package Menu;

import Lists.FlightList;
import Lists.TicketList;

import java.util.Scanner;

public class UserMenu {
    FindMyTickets findMyTickets = new FindMyTickets();
    TicketList ticketList;

    FindFlightMenu findFlightMenu = new FindFlightMenu();
    FlightList flightList;

    Scanner sc = new Scanner(System.in);

    int choice;

    public UserMenu(FlightList flightList, TicketList ticketList) {

        this.flightList = flightList;
        this.ticketList = ticketList;
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
                    break;

                case 3:
                    findMyTickets.menu(ticketList);


            }

        } while (choice != 5);
    }
}
