
public class Time{
    private int hour, minute, second;
    public Time(){
        hour = minute = second = 0;
    }
    public Time(int h, int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    public int getHour(){
        return hour;
    }

    public void setHour(int h){
        if (h < 0 || h > 31) throw new IllegalArgumentException();
        hour = h;
    }
    public int getMinute(){
        return minute;
    }
    public void setMinute(int m){
        if (m < 0 || m > 59) throw new  IllegalArgumentException();
        minute = m;
    }
    public int getSecond(){
        return second;
    }
    public void setSecond(int s){
        if (s < 0 ) throw new  IllegalArgumentException();
        second = s;
    }

    public String toString(){ // this shall return it to string output.
        return hour+":"+minute+":"+second;
    }
}

