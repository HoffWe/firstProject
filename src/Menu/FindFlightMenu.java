package Menu;

import Lists.FlightList;
import Models.Flight;

import java.util.List;
import java.util.Scanner;

public class FindFlightMenu {
    Scanner sc = new Scanner(System.in);
    public void menu(FlightList flightList) {
        FlightList fl = flightList;
        int choice = 0;

        do {

            System.out.println("Podaj miasto wylotu");
            String departure = sc.nextLine();
            System.out.println("Podaj miasto przylotu");
            String destination = sc.nextLine();

            List<Flight> flights = fl.getFlightsByDepartureAndDestination(departure, destination);
            for (Flight flight : flights) {
                System.out.println(flight);
            }

            System.out.println("Wyszukaj ponownie nacisnij: 1");
            System.out.println("Wyjcie nacisnij: 2");
            choice = sc.nextInt();

            switch (choice){
                case 1: menu(fl);
                break;
                default:
                    break;
            }

        }while(choice != 2);



    }




}
