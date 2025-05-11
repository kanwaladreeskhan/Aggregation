package aggregation;
public class Time {
    private int hour;
    private int minute;
    Time(int hour,int minute){
        this.hour=hour;
        this.minute=minute;
    }
    @Override
public String toString() {
    return hour + ":" + minute;
}
     }
