
/**
 * Created by Al-Ghammari on 10/28/2016.
 */
public class Main {
    public static void main(String[] args){
        Time t = new Time(10, 0, 0);
        Date d = new Date(29, 10,2016);
        Appointment app = new Appointment("JavaClass",d,t);
        System.out.println(app);
    }
}

