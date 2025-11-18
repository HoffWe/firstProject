package Menu;

import Lists.TicketList;
import Models.Ticket;

import java.util.List;
import java.util.Scanner;

public class FindMyTickets {

    Scanner sc = new Scanner(System.in);

    public void menu(TicketList tickets){
        System.out.println("Podaj nr id pasazera");
        int passengerId = sc.nextInt();

        List<Ticket> t = tickets.getTicketsByPassengerId(passengerId);

        for(Ticket ticket : t){
            System.out.println(ticket.toString());
        }

    }
}
