package Menu;

import Lists.FlightList;
import Lists.PassengerList;
import Lists.TicketList;

import java.util.Scanner;

public class UserMenu {
    FindMyTickets findMyTickets = new FindMyTickets();
    TicketList ticketList;
    PassengerList passengerList;

    FindFlightMenu findFlightMenu = new FindFlightMenu();
    ReturnTickets returnTickets = new ReturnTickets();
    FlightList flightList;

    BuyTicketMenu buyTicketMenu = new BuyTicketMenu();

    Scanner sc = new Scanner(System.in);

    int choice;

    public UserMenu(FlightList flightList, TicketList ticketList, PassengerList passengerList) {

        this.passengerList = passengerList;
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

                case 2:
                    buyTicketMenu.menu(passengerList,flightList,ticketList);
                    break;

                case 3:
                    findMyTickets.menu(ticketList);
                    break;

                case 4:
                    returnTickets.menu(ticketList,passengerList);
                    break;


            }

        } while (choice != 5);
    }
}
