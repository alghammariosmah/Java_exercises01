/**
 * Created by Al-Ghammari on 11/11/2016.
 */

public class List{
	private Node head = null, tail = null;

    void append(int value){
        Node p = new Node(value);
        if (head == null)head = p;
        else tail.setNext(p);
        this.tail = p;
    }
    
    public boolean contains(int value){
    	Node n = head;
    	while (n != null){
    		if(n.getValue() == value) return true;
    		n = n.getNext();
    	}
    	return false;
    }
    
    public int getOccurences(int value){
    	Node n = head;
    	int count = 0;
    	while (n != null){
    		if(n.getValue() == value) count++;
    		n = n.getNext();
    	}
    	return count;
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



