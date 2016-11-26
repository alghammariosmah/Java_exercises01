
public class CollectionMain {
	public static void main(String[] args){
		
		Collection collection = new DynamicList();
		Item p= new Person("Ben",0);
		Item p1 = new Person("Sam",1);
		Item p2 = new Person ("Johannes",2);
		collection.add(p);
		collection.add(p1);
		collection.add(p2);
		System.out.println(collection);
		
	}
}
