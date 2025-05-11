package aggregation;
import java.util.ArrayList;
import java.util.List;
public class Aggregation {
    public static void main(String[] args) {
        // Create Time objects
        Time departure = new Time(10, 30);
        Time arrival = new Time(13, 45);
        // Create Passenger list
        List<Passenger> passengers = new ArrayList<>();
        passengers.add(new Passenger("Alice"));
        passengers.add(new Passenger("Bob"));
        // Create Flight using aggregation
        Flight flight = new Flight("AI202", "New York", departure, arrival, passengers);
        // Print flight info
        flight.printInfo();
    }
}
