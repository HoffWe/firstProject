package Menu;

import Lists.FlightList;
import Lists.PassengerList;
import Models.Flight;
import Models.Passenger;
import Models.Ticket;
import Lists.TicketList;

import java.util.List;
import java.util.Scanner;

public class BuyTicketMenu {
    Scanner sc = new Scanner(System.in);

    public void menu(PassengerList passegers, FlightList flights, TicketList tickets) {

        System.out.println("Podaj id pasazera (login)");
        int passengerid = sc.nextInt();

        Passenger p = passegers.getPassenger(passengerid);

        System.out.println("Podaj id lotu");
        int flightid = sc.nextInt();

        Flight f = flights.getFlightById(flightid);

        System.out.println("Masz extra bagaz?");
        boolean extraBaggage = sc.nextBoolean();

        Ticket newTicket = new Ticket(p, f, extraBaggage);

        tickets.addTicket(newTicket);

    }
}
