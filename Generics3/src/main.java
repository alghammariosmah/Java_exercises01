import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Item.Item;
import Item.Person;
import Item.Ranking;
import Time.SimpleTime;
import Time.Time;

public class main {

	public static void main(String[] args) {
		Item p= new Person("Ben",0);
		Item p1 = new Person("Sam",1);
		Item p2 = new Person ("Johannes",2);
		Item p3 = new Person ("Pramod",3);
		
		
		Time t = new SimpleTime();
		t.set(5000);
		Ranking r = new Ranking(p, t);
		
		Time t1 = new SimpleTime();
		t1.set(3000);
		Ranking r1 = new Ranking(p1, t1);
		
		Time t2 = new SimpleTime();
		t2.set(1000);
		Ranking r2 = new Ranking(p2, t2);
		
		Time t3 = new SimpleTime();
		t3.set(6000);
		Ranking r3 = new Ranking(p3, t3);
		
		List<Ranking> rankings = new ArrayList<>();
		
		rankings.add(r);
		rankings.add(r1);
		rankings.add(r2);
		
	
		System.out.println(rankings);
		
		
		
		rankings.sort(new comperator()); // important to set up your comparator. 
		System.out.println(rankings);
		
	}
}

class comperator implements Comparator<Ranking>{

	public int compare(Ranking r1, Ranking r2) {
		int res = r1.getHour() - r2.getHour();
		if (res != 0)return res;
		res = r1.getMinute()-r2.getMinute();
		if (res != 0) return res;
		return r1.getSecond()- r2.getSecond();
	}
	
}

