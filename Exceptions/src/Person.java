

public class Person implements Item {
	public Person() { 
		this(null, 0); 
	} 
	public Person(String p, int iden) { 
		name = p;
		id = iden;
	} 
	
	public int getID(){
		return id;
	}
	public String getName(){
		return name;
	}
	
	public String toString() { 
		return "name: "+name; 
	}
	private String name;
	private int id;
	
}
