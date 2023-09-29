package dataStructure;

public class LinkedList <T>{ 
    
	  private Node<T> Head; 
	  private Node<T> current; 
	   
	  public LinkedList(){ 
	      Head=current=null; 
	  } 
	   
	  public boolean Empty(){ 
	      return Head == null; 
	  } 
	  public boolean Full(){ 
	      return false; 
	  } 
	  public boolean Last(){ 
	      return current.next == null; 
	  } 
	  public void FindFirst(){ 
	      current = Head; 
	  } 
	  public void FindNext(){ 
	      current = current.next; 
	  } 
	  public void Update(T d){ 
	      current.data = d; 
	  } 
	  
	    public T Retrive(){ 
	        return current.data; 
	    } 
	 
	    public void Insert(T d) {
	    
	    	Node<T> tmp;
	    	if (Empty()) {
	    		current = Head = new Node<T> (d);
	    	}
	    	else {
	    		tmp = current.next;
	    		current.next = new Node<T> (d);
	    		current = current.next;
	    		current.next = tmp;
	    	}
	    }
	    
	    	public void Remove () {
	    		
	    		if (current == Head) {
	    			Head = Head.next;
	    		}
	    		else {
	    			Node<T> tmp = Head;
	    			while (tmp.next != current)
	    				tmp = tmp.next;
	    			tmp.next = current.next;
	    		}
	    		if (current.next == null)
	    			current = Head;
	    		else
	    			current = current.next;
	    	}
	    
	    
	         
	    }
