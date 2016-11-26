class Node{
	public Node(){
		this(0,null);
	}
	
	public Node (int value){
		this(value,null);
	}
	public Node(int value, Node next){
		this.value = value;
		this.next = next;
	}
    
    public Node getNext(){
    	return next;
    }
    public void setNext(Node next){
    	this.next = next;
    }
    
    public void setValue(int value){
    	this.value = value;
    }
    public int getValue(){
    	return value;
    }
    
    private int value;
    private Node next;
}
