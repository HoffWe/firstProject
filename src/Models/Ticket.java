package Models;

import java.time.LocalDateTime;

public class Ticket {
  private int id;
  private Passenger passenger;
  private Flight flight;
  private boolean extraBaggage;

  //Konstruktor---------------------------------------------------------
  public Ticket(int a, Passenger passenger, Flight flight, boolean extraBaggage) {

    this.id = a;
    this.passenger = passenger;
    this.flight = flight;
    this.extraBaggage = extraBaggage;

  }

  //Gettery---------------------------------------------------------
  public int getId(){
    return id;
  }

  public Passenger getPassenger(){
    return passenger;
  }

  public Flight getFlight(){
    return flight;
  }

  public boolean getExtraBaggage(){
    return extraBaggage;
  }

  //Settery---------------------------------------------------------
  public void setId(int b){
    this.id = b;
  }

  public void setPassenger(Passenger passengerVoid){
    this.passenger = passengerVoid;
  }

  public void setFlight(Flight flightVoid){
    this.flight = flightVoid;
  }

  public void setExtraBaggage(boolean extraBaggageVoid){
    this.extraBaggage = extraBaggageVoid;
  }
}
