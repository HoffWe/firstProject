package Menu;

import Lists.PassengerList;
import Lists.TicketList;
import Models.Ticket;

import java.util.List;
import java.util.Scanner;


public class ReturnTickets {

    Scanner sc = new Scanner(System.in);

    public void menu(TicketList ticketList, PassengerList passengerList){

        TicketList tl = ticketList;
        PassengerList pl = passengerList;

        System.out.println("podaj id pasazera");
        int id = sc.nextInt();
        sc.nextLine();

        List<Ticket> ticket = tl.getTicketsByPassengerId(id);


        ticket.forEach(t -> System.out.println(t.toString()));

        System.out.println("Podaj numer id (listy) biletu ktory chcesz usunac");
        int idl = sc.nextInt()-1;
        sc.nextLine();

        Ticket ticketToDelete = ticket.get(idl);

        tl.deleteTicket(ticketToDelete);



    }

}
