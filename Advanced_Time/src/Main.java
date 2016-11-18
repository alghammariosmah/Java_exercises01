
public class Main {
	public static void main(String[] args){
		SimpleTime t = new SimpleTime();
		AdvanceTime t2 = new AdvanceTime();
		t2.set(12, 10, 20);
		t2.setMillis(10);
		System.out.println(t2);
	}
}
