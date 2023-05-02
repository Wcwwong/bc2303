package week2;

import java.util.ArrayList;

public class Bus {
  static int peopleAtDestination; //total no of people at destination

  Driver driver;
  int totalNoOfSeat;
  String plateNo;
  ArrayList<String> passengers = new ArrayList<>(); 
  
  public void addPeople(String passengerName) {
    this.passengers.add(passengerName);
  }
  public void releasePeople(){
    peopleAtDestination = peopleAtDestination + this.passengers.size();
    this.passengers.clear();
  }

  public static void main(String[] args) {
    Bus bus;
    BusStop busStop = new BusStop();
    
    for (int i = 0; i < 5; i++){
      bus = new Bus();// bus
      bus.driver = new Driver("Max"); 
      if (i==0){
        bus.addPeople("Jason");
        bus.addPeople("Mary");
      } else if (i==2){
        bus.addPeople("John");
      }
      bus.releasePeople();
    }
    System.out.println("total noumber of people at destination=" + peopleAtDestination);
  }
}
