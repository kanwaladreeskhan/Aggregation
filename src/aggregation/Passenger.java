package aggregation;
import java.util.ArrayList;
import java.util.List;
public class Passenger {
     private String name;
       private List<Passenger>passengerList;
       Passenger(String name){
           this.name=name;
          passengerList = new ArrayList<>();
       }
      @Override
     public String toString() {
    return name;
}
}
