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


    //konstruktor

    public Flight(int idFlight, Airplane airplane, String destination, String departure, LocalDateTime departureTime, LocalDateTime arrivalTime,
                  int gate, int stand) {

        this.id = idFlight;
        this.airplane = airplane;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.gate = gate;
        this.stand = stand;

    }

    //gettery

    public int getId(){
        return id;
    }

    public Airplane getAirplane(){
        return airplane;
    }

    public String getDestination(){
        return destination;
    }

    public String getDeparture(){
        return departure;
    }

    public LocalDateTime getDepartureTime(){
        return departureTime;
    }

    public LocalDateTime getArrivalTime(){
        return arrivalTime;
    }

    public int getGate(){
        return gate;
    }

    public int getStand(){
        return stand;
    }


    //settery

    public void setId(int id){
        this.id = id;
    }

    public void setAirplane(Airplane airplane){
        this.airplane = airplane;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }

    public void setDeparture(String departure){
        this.departure = departure;
    }

    public void setArrivalTime(LocalDateTime arrivalTime){
        this.arrivalTime = arrivalTime;
    }

    public void setDepartureTime(LocalDateTime departureTime){
        this.departureTime = departureTime;
    }

    public void setGate(int gate){
        this.gate = gate;
    }

    public void setStand(int stand){
        this.stand = stand;
    }

}