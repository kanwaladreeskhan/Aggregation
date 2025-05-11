package aggregation;
 import java.util.List;
public class Flight {
    private String flightNo;
    private String destination;
    private  Time departureTime;
    private  Time arrivalTime;
     private List<Passenger> passengers;
     Flight(String flightNo,String destination, Time departureTime, Time arrivalTime,List<Passenger> passengers){
        this.flightNo=flightNo;
        this.destination=destination;
        this.departureTime=departureTime;
        this.arrivalTime=arrivalTime;
        this.passengers=passengers;
  }
    public void printInfo(){
         System.out.println("______Flight Information_____");
        System.out.println("Flight No:" + flightNo+"\nDestination:"+ destination+"\nDeparture:"+ departureTime+"\nArrival:"+ arrivalTime+"\nNumber of passenger: "+ passengers.size() );
        System.out.println("Passenger List:");
        for (Passenger p : passengers) {
            System.out.println("- " + p.toString());
        }
    }
}
