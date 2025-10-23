package Lists;

import Models.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketList {
    private List<Ticket> tickets = new ArrayList<>();

    public TicketList(PassengerList passengerList, FlightList flightList) {
        tickets.add(new Ticket(1, passengerList.getAll().get(0), flightList.getAll().get(0), true));
        tickets.add(new Ticket(2, passengerList.getAll().get(1), flightList.getAll().get(1), false));
        tickets.add(new Ticket(3, passengerList.getAll().get(2), flightList.getAll().get(2), true));
        tickets.add(new Ticket(4, passengerList.getAll().get(3), flightList.getAll().get(3), false));
        tickets.add(new Ticket(5, passengerList.getAll().get(4), flightList.getAll().get(4), true));
        tickets.add(new Ticket(6, passengerList.getAll().get(5), flightList.getAll().get(5), false));
        tickets.add(new Ticket(7, passengerList.getAll().get(6), flightList.getAll().get(6), true));
        tickets.add(new Ticket(8, passengerList.getAll().get(7), flightList.getAll().get(7), false));
        tickets.add(new Ticket(9, passengerList.getAll().get(8), flightList.getAll().get(8), true));
        tickets.add(new Ticket(10, passengerList.getAll().get(9), flightList.getAll().get(9), false));
        tickets.add(new Ticket(11, passengerList.getAll().get(10), flightList.getAll().get(10), true));
        tickets.add(new Ticket(12, passengerList.getAll().get(11), flightList.getAll().get(11), false));
        tickets.add(new Ticket(13, passengerList.getAll().get(12), flightList.getAll().get(12), true));
        tickets.add(new Ticket(14, passengerList.getAll().get(13), flightList.getAll().get(13), false));
        tickets.add(new Ticket(15, passengerList.getAll().get(14), flightList.getAll().get(14), true));
        tickets.add(new Ticket(16, passengerList.getAll().get(15), flightList.getAll().get(15), false));
        tickets.add(new Ticket(17, passengerList.getAll().get(16), flightList.getAll().get(16), true));
        tickets.add(new Ticket(18, passengerList.getAll().get(17), flightList.getAll().get(17), false));
        tickets.add(new Ticket(19, passengerList.getAll().get(18), flightList.getAll().get(18), true));
        tickets.add(new Ticket(20, passengerList.getAll().get(19), flightList.getAll().get(19), false));
        tickets.add(new Ticket(21, passengerList.getAll().get(20), flightList.getAll().get(20), true));
        tickets.add(new Ticket(22, passengerList.getAll().get(21), flightList.getAll().get(21), false));
        tickets.add(new Ticket(23, passengerList.getAll().get(22), flightList.getAll().get(22), true));
        tickets.add(new Ticket(24, passengerList.getAll().get(23), flightList.getAll().get(23), false));
        tickets.add(new Ticket(25, passengerList.getAll().get(24), flightList.getAll().get(24), true));
        tickets.add(new Ticket(26, passengerList.getAll().get(25), flightList.getAll().get(25), false));
        tickets.add(new Ticket(27, passengerList.getAll().get(26), flightList.getAll().get(26), true));
        tickets.add(new Ticket(28, passengerList.getAll().get(27), flightList.getAll().get(27), false));
        tickets.add(new Ticket(29, passengerList.getAll().get(28), flightList.getAll().get(28), true));
        tickets.add(new Ticket(30, passengerList.getAll().get(29), flightList.getAll().get(29), false));
        tickets.add(new Ticket(31, passengerList.getAll().get(30), flightList.getAll().get(30), true));
        tickets.add(new Ticket(32, passengerList.getAll().get(31), flightList.getAll().get(31), false));
        tickets.add(new Ticket(33, passengerList.getAll().get(32), flightList.getAll().get(32), true));
        tickets.add(new Ticket(34, passengerList.getAll().get(33), flightList.getAll().get(33), false));
        tickets.add(new Ticket(35, passengerList.getAll().get(34), flightList.getAll().get(34), true));
        tickets.add(new Ticket(36, passengerList.getAll().get(35), flightList.getAll().get(35), false));
        tickets.add(new Ticket(37, passengerList.getAll().get(36), flightList.getAll().get(36), true));
        tickets.add(new Ticket(38, passengerList.getAll().get(37), flightList.getAll().get(37), false));
        tickets.add(new Ticket(39, passengerList.getAll().get(38), flightList.getAll().get(38), true));
        tickets.add(new Ticket(40, passengerList.getAll().get(39), flightList.getAll().get(39), false));
        tickets.add(new Ticket(41, passengerList.getAll().get(40), flightList.getAll().get(40), true));
        tickets.add(new Ticket(42, passengerList.getAll().get(41), flightList.getAll().get(41), false));
        tickets.add(new Ticket(43, passengerList.getAll().get(42), flightList.getAll().get(42), true));
        tickets.add(new Ticket(44, passengerList.getAll().get(43), flightList.getAll().get(43), false));
        tickets.add(new Ticket(45, passengerList.getAll().get(44), flightList.getAll().get(44), true));
        tickets.add(new Ticket(46, passengerList.getAll().get(45), flightList.getAll().get(45), false));
        tickets.add(new Ticket(47, passengerList.getAll().get(46), flightList.getAll().get(46), true));
        tickets.add(new Ticket(48, passengerList.getAll().get(47), flightList.getAll().get(47), false));
        tickets.add(new Ticket(49, passengerList.getAll().get(48), flightList.getAll().get(48), true));
        tickets.add(new Ticket(50, passengerList.getAll().get(49), flightList.getAll().get(49), false));
    }

    public List<Ticket> getAll() {
        return tickets;
    }
}