/**
 * Created by Al-Ghammari on 10/28/2016.
 */
public class Appointment {
    private String st;
    private Date date;
    private Time time;

    public Appointment(){ // constructor
        st = "Java Class";
        Date date = new Date();
        Time time = new Time();
    }
    public Appointment(String s, Date d, Time t){ // declaring the d, t as new
        st = s;
        date = d;
        time = t;
    }
    public String toString(){
        return st+" You have appointment on " + date + " at " + time;
    }



}
