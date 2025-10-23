package Menu;

import Lists.FlightList;
import Models.Flight;

import java.util.List;
import java.util.Scanner;

public class FindFlightMenu {
    Scanner sc = new Scanner(System.in);
    public void menu(FlightList flightList) {
        System.out.println("Podaj miasto wylotu");
        String departure = sc.nextLine();
        System.out.println("Podaj miasto przylotu");
        String destination = sc.nextLine();


        List<Flight> flights = flightList.getFlightsByDepartureAndDestination(departure, destination);
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
}
