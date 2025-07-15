package Models;

import java.time.LocalDateTime;

public class Flight {
    private int id;
    private Airplane airplane;
    private String destination;
    private String departure;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private int duration;
    private int gate;
    private int stand;
}
