import java.util.ArrayList;

public class DynamicList implements Collection {
	ArrayList<String> list = new ArrayList<>();
	
	public int size(){
		return list.size();
	}
	
	public void add(Item item){
		list.add(item.toString());
	}
	
	public boolean contains(Item item){
		return list.contains(item.toString());
	}
	
	public void remove(Item item){
		list.remove(item.toString());
	}
	
	public String toString(){
		return list.toString();
	}
}
