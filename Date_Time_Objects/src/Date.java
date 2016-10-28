

public class Date{
    private int year,month, day;
    public Date(){
        year = month = day =0;
    }
    public Date(int d,int m,int y){
        setDay(d);
        setMonth(m);
        setYear(y);
    }

    public int getDay(){
        return day;
    }

    public void setDay(int d){
        if (d < 0 || d > 31) throw new IllegalArgumentException();
        day = d;
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int m){
        if (m <= 0 || m > 12) throw new  IllegalArgumentException();
        month = m;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int y){
        if (y < 0 ) throw new  IllegalArgumentException();
        year = y;
    }
    public String toString(){ // this shall return it to string output.
        return day+":"+month+":"+year;
    }

}
