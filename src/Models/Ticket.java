package Models;

import java.time.LocalDateTime;

public class Ticket {
  private Passenger passenger;
  private Flight flight;
  private boolean extraBaggage;

  //Konstruktor---------------------------------------------------------
  public Ticket(Passenger passenger, Flight flight, boolean extraBaggage) {

    this.passenger = passenger;
    this.flight = flight;
    this.extraBaggage = extraBaggage;

  }

  //Gettery---------------------------------------------------------


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
