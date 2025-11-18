package Lists;

import Models.Flight;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FlightList {
    private List<Flight> flights = new ArrayList<>();

    public FlightList(AirplaneList airplaneList) {
        flights.add(new Flight(airplaneList.getAll().get(0), "New York", "London", LocalDateTime.of(2025, 10, 23, 10, 0), LocalDateTime.of(2025, 10, 23, 18, 0), 1, 1));
        flights.add(new Flight(airplaneList.getAll().get(1), "Paris", "Tokyo", LocalDateTime.of(2025, 10, 23, 11, 0), LocalDateTime.of(2025, 10, 23, 23, 0), 2, 2));
        flights.add(new Flight(airplaneList.getAll().get(2), "Sydney", "Los Angeles", LocalDateTime.of(2025, 10, 23, 12, 0), LocalDateTime.of(2025, 10, 23, 22, 0), 3, 3));
        flights.add(new Flight(airplaneList.getAll().get(3), "Dubai", "Berlin", LocalDateTime.of(2025, 10, 23, 13, 0), LocalDateTime.of(2025, 10, 23, 17, 0), 4, 4));
        flights.add(new Flight(airplaneList.getAll().get(4), "Toronto", "Mexico City", LocalDateTime.of(2025, 10, 23, 14, 0), LocalDateTime.of(2025, 10, 23, 20, 0), 5, 5));
        flights.add(new Flight(airplaneList.getAll().get(5), "Beijing", "Seoul", LocalDateTime.of(2025, 10, 23, 15, 0), LocalDateTime.of(2025, 10, 23, 19, 0), 6, 6));
        flights.add(new Flight(airplaneList.getAll().get(6), "Moscow", "Istanbul", LocalDateTime.of(2025, 10, 23, 16, 0), LocalDateTime.of(2025, 10, 23, 20, 0), 7, 7));
        flights.add(new Flight(airplaneList.getAll().get(7), "Rio de Janeiro", "Buenos Aires", LocalDateTime.of(2025, 10, 23, 17, 0), LocalDateTime.of(2025, 10, 23, 21, 0), 8, 8));
        flights.add(new Flight(airplaneList.getAll().get(8), "Cairo", "Athens", LocalDateTime.of(2025, 10, 23, 18, 0), LocalDateTime.of(2025, 10, 23, 22, 0), 9, 9));
        flights.add(new Flight(airplaneList.getAll().get(9), "Madrid", "Lisbon", LocalDateTime.of(2025, 10, 23, 19, 0), LocalDateTime.of(2025, 10, 23, 21, 0), 10, 10));
        flights.add(new Flight(airplaneList.getAll().get(10), "Chicago", "Miami", LocalDateTime.of(2025, 10, 24, 6, 0), LocalDateTime.of(2025, 10, 24, 10, 0), 11, 11));
        flights.add(new Flight(airplaneList.getAll().get(11), "Bangkok", "Singapore", LocalDateTime.of(2025, 10, 24, 7, 0), LocalDateTime.of(2025, 10, 24, 11, 0), 12, 12));
        flights.add(new Flight(airplaneList.getAll().get(12), "Los Angeles", "San Francisco", LocalDateTime.of(2025, 10, 24, 8, 0), LocalDateTime.of(2025, 10, 24, 9, 30), 13, 13));
        flights.add(new Flight(airplaneList.getAll().get(13), "Tokyo", "Osaka", LocalDateTime.of(2025, 10, 24, 9, 0), LocalDateTime.of(2025, 10, 24, 10, 15), 14, 14));
        flights.add(new Flight(airplaneList.getAll().get(14), "Seoul", "Beijing", LocalDateTime.of(2025, 10, 24, 10, 0), LocalDateTime.of(2025, 10, 24, 12, 0), 15, 15));
        flights.add(new Flight(airplaneList.getAll().get(15), "London", "New York", LocalDateTime.of(2025, 10, 24, 11, 0), LocalDateTime.of(2025, 10, 24, 19, 0), 16, 16));
        flights.add(new Flight(airplaneList.getAll().get(16), "Paris", "Los Angeles", LocalDateTime.of(2025, 10, 24, 12, 0), LocalDateTime.of(2025, 10, 24, 20, 0), 17, 17));
        flights.add(new Flight(airplaneList.getAll().get(17), "Berlin", "Rome", LocalDateTime.of(2025, 10, 24, 13, 0), LocalDateTime.of(2025, 10, 24, 15, 0), 18, 18));
        flights.add(new Flight(airplaneList.getAll().get(18), "Dubai", "Mumbai", LocalDateTime.of(2025, 10, 24, 14, 0), LocalDateTime.of(2025, 10, 24, 18, 0), 19, 19));
        flights.add(new Flight(airplaneList.getAll().get(19), "Moscow", "Tokyo", LocalDateTime.of(2025, 10, 24, 15, 0), LocalDateTime.of(2025, 10, 24, 23, 0), 20, 20));
        flights.add(new Flight(airplaneList.getAll().get(20), "Rio de Janeiro", "Santiago", LocalDateTime.of(2025, 10, 25, 6, 0), LocalDateTime.of(2025, 10, 25, 10, 0), 21, 21));
        flights.add(new Flight(airplaneList.getAll().get(21), "Toronto", "Vancouver", LocalDateTime.of(2025, 10, 25, 7, 0), LocalDateTime.of(2025, 10, 25, 11, 0), 22, 22));
        flights.add(new Flight(airplaneList.getAll().get(22), "Athens", "Cairo", LocalDateTime.of(2025, 10, 25, 8, 0), LocalDateTime.of(2025, 10, 25, 10, 0), 23, 23));
        flights.add(new Flight(airplaneList.getAll().get(23), "Lisbon", "Madrid", LocalDateTime.of(2025, 10, 25, 9, 0), LocalDateTime.of(2025, 10, 25, 11, 0), 24, 24));
        flights.add(new Flight(airplaneList.getAll().get(24), "Miami", "Chicago", LocalDateTime.of(2025, 10, 25, 10, 0), LocalDateTime.of(2025, 10, 25, 14, 0), 25, 25));
        flights.add(new Flight(airplaneList.getAll().get(25), "Singapore", "Bangkok", LocalDateTime.of(2025, 10, 25, 11, 0), LocalDateTime.of(2025, 10, 25, 15, 0), 26, 26));
        flights.add(new Flight(airplaneList.getAll().get(26), "San Francisco", "Los Angeles", LocalDateTime.of(2025, 10, 25, 12, 0), LocalDateTime.of(2025, 10, 25, 13, 30), 27, 27));
        flights.add(new Flight(airplaneList.getAll().get(27), "Osaka", "Tokyo", LocalDateTime.of(2025, 10, 25, 13, 0), LocalDateTime.of(2025, 10, 25, 14, 15), 28, 28));
        flights.add(new Flight(airplaneList.getAll().get(28), "Beijing", "Seoul", LocalDateTime.of(2025, 10, 25, 14, 0), LocalDateTime.of(2025, 10, 25, 16, 0), 29, 29));
        flights.add(new Flight(airplaneList.getAll().get(29), "New York", "Paris", LocalDateTime.of(2025, 10, 25, 15, 0), LocalDateTime.of(2025, 10, 25, 23, 0), 30, 30));
        flights.add(new Flight(airplaneList.getAll().get(30), "London", "Berlin", LocalDateTime.of(2025, 10, 26, 6, 0), LocalDateTime.of(2025, 10, 26, 8, 0), 31, 31));
        flights.add(new Flight(airplaneList.getAll().get(31), "Rome", "Madrid", LocalDateTime.of(2025, 10, 26, 7, 0), LocalDateTime.of(2025, 10, 26, 10, 0), 32, 32));
        flights.add(new Flight(airplaneList.getAll().get(32), "Mumbai", "Dubai", LocalDateTime.of(2025, 10, 26, 8, 0), LocalDateTime.of(2025, 10, 26, 12, 0), 33, 33));
        flights.add(new Flight(airplaneList.getAll().get(33), "Tokyo", "Moscow", LocalDateTime.of(2025, 10, 26, 9, 0), LocalDateTime.of(2025, 10, 26, 17, 0), 34, 34));
        flights.add(new Flight(airplaneList.getAll().get(34), "Santiago", "Rio de Janeiro", LocalDateTime.of(2025, 10, 26, 10, 0), LocalDateTime.of(2025, 10, 26, 14, 0), 35, 35));
        flights.add(new Flight(airplaneList.getAll().get(35), "Vancouver", "Toronto", LocalDateTime.of(2025, 10, 26, 11, 0), LocalDateTime.of(2025, 10, 26, 15, 0), 36, 36));
        flights.add(new Flight(airplaneList.getAll().get(36), "Cairo", "Athens", LocalDateTime.of(2025, 10, 26, 12, 0), LocalDateTime.of(2025, 10, 26, 14, 0), 37, 37));
        flights.add(new Flight(airplaneList.getAll().get(37), "Lisbon", "London", LocalDateTime.of(2025, 10, 26, 13, 0), LocalDateTime.of(2025, 10, 26, 16, 0), 38, 38));
        flights.add(new Flight(airplaneList.getAll().get(38), "Chicago", "Miami", LocalDateTime.of(2025, 10, 26, 14, 0), LocalDateTime.of(2025, 10, 26, 18, 0), 39, 39));
        flights.add(new Flight(airplaneList.getAll().get(39), "Bangkok", "Singapore", LocalDateTime.of(2025, 10, 26, 15, 0), LocalDateTime.of(2025, 10, 26, 19, 0), 40, 40));
        flights.add(new Flight(airplaneList.getAll().get(40), "Los Angeles", "San Francisco", LocalDateTime.of(2025, 10, 26, 16, 0), LocalDateTime.of(2025, 10, 26, 17, 30), 41, 41));
        flights.add(new Flight(airplaneList.getAll().get(41), "Osaka", "Tokyo", LocalDateTime.of(2025, 10, 26, 17, 0), LocalDateTime.of(2025, 10, 26, 18, 15), 42, 42));
        flights.add(new Flight(airplaneList.getAll().get(42), "Seoul", "Beijing", LocalDateTime.of(2025, 10, 26, 18, 0), LocalDateTime.of(2025, 10, 26, 20, 0), 43, 43));
        flights.add(new Flight(airplaneList.getAll().get(43), "New York", "Paris", LocalDateTime.of(2025, 10, 26, 19, 0), LocalDateTime.of(2025, 10, 26, 23, 0), 44, 44));
        flights.add(new Flight(airplaneList.getAll().get(44), "London", "Berlin", LocalDateTime.of(2025, 10, 27, 6, 0), LocalDateTime.of(2025, 10, 27, 8, 0), 45, 45));
        flights.add(new Flight(airplaneList.getAll().get(45), "Rome", "Madrid", LocalDateTime.of(2025, 10, 27, 7, 0), LocalDateTime.of(2025, 10, 27, 10, 0), 46, 46));
        flights.add(new Flight(airplaneList.getAll().get(46), "Mumbai", "Dubai", LocalDateTime.of(2025, 10, 27, 8, 0), LocalDateTime.of(2025, 10, 27, 12, 0), 47, 47));
        flights.add(new Flight(airplaneList.getAll().get(47), "Tokyo", "Moscow", LocalDateTime.of(2025, 10, 27, 9, 0), LocalDateTime.of(2025, 10, 27, 17, 0), 48, 48));
        flights.add(new Flight(airplaneList.getAll().get(48), "Santiago", "Rio de Janeiro", LocalDateTime.of(2025, 10, 27, 10, 0), LocalDateTime.of(2025, 10, 27, 14, 0), 49, 49));
        flights.add(new Flight(airplaneList.getAll().get(49), "Vancouver", "Toronto", LocalDateTime.of(2025, 10, 27, 11, 0), LocalDateTime.of(2025, 10, 27, 15, 0), 50, 50));
    }

    public List<Flight> getAll() {
        return flights;
    }

    public List<Flight> getFlightsByDepartureAndDestination(String departure, String destination) {
        return flights.stream().filter(f -> departure.equals(f.getDeparture()) && destination.equals(f.getDestination())).toList();
    }

    public void printList(){
        flights.forEach(flight -> System.out.println(flight.toString()));
    }

    public Flight getFlightById(int flightId){
        return flights.get(flightId);
    }
}