/**
 * Created by Al-Ghammari on 11/11/2016.
 */

public class DList{
	private Node head = null, tail = null;

    void insert(int value){
        Node p = new Node(value);
        if (head == null)head = p;
        else tail.setNext(p);
        this.tail = p;
    }
    
    public void delete(int value){
    	Node p = new Node(value);
        if (head == null)head = p;
        else tail.setNext(p);
        this.tail = p;
    }
    
    
    
    public String toString(){
    	StringBuffer sb = new StringBuffer();
    	sb.append("[");
    	Node n = head;
    	while(n!=null){
    		if (n!=head) sb.append(",");
    		sb.append(n.getValue());
    		n = n.getNext();
    	}
    	sb.append("]");
    	return sb.toString();
    }
}



