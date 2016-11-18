public class SimpleTime {
	public SimpleTime() { 
		set(0,0,0); 
	} 
	public SimpleTime(int h,int m,int s) { 
		set(h,m,s); 
	} 
	public void set(int h, int m, int s) { 
		if(h<0 || h>23) throw new IllegalArgumentException(); hour= h; 
		if(m<0 || m>59) throw new IllegalArgumentException(); 
		min= m; if(s<0 || s>59) throw new IllegalArgumentException(); 
		sec= s;
	}
	
	public String toString() { 
		if(mode==Mode.T24) return hour+":"+min+":"+sec; 
		if(hour<=12) return hour+":"+min+":"+sec+" AM"; 
		return hour-12+":"+min+":"+sec+" PM"; 
	} 
	private int hour,min,sec;
	private Mode mode= Mode.T24;
	public enum Mode { AM_PM, T24}
}


