import Lists.AirplaneList;
import Lists.FlightList;
import Menu.UserMenu;
import Models.Airplane;
import Models.Flight;
import Models.Passenger;
import Models.Ticket;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* kolekcje :
        -list ( zachowana kolejnosć dodawania elementów, dozwolone duplikaty)
        -set ( nie zachowuje koloejności dodawania elementów, brak duplikatów)
        -map ( kolekcja klucz-wartość, unikalny klucz)
        -queue(dequeue) (kolejka FIFO)
         */

        AirplaneList airplaneList = new AirplaneList();
        FlightList flightList = new FlightList(airplaneList);
        UserMenu userMenu = new UserMenu(flightList);
        flightList.printList();
        userMenu.menu(flightList);
    }
}