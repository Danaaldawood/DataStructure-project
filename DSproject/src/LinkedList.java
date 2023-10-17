package phonebook;


public class LinkedList <T> {
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
	    	if (Head==null) {
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
	      
           public void AddSortContact(T x){
               Node<T> p=new Node<T>(x);
             if(Head==null){
                 Head=current=p;
                 return;}
             
             if(((Contact)x).CompareTo(((Contact)Head.data).ContactName)<0){
                 p.next=Head;
                 Head=p;
                 current=p;
                 return;}
             
             Node<T> temp=Head;
             Node<T> pre=null;
             while(temp!=null){
                 if(((Contact)temp.data).CompareTo(((Contact)x).ContactName)<=0)
                     pre=temp;  temp=temp.next;
                        
             }
             pre.next=p;
             p.next=temp;  
             current=p;  
           }
           
           
          public void AddSortEvent(T x){
               Node<T> p=new Node<T>(x); 
             if(Head==null){
                 Head=current=p;
                 return;}
             
             if(((Event)x).CompareTo(((Event)Head.data).Title)<0){
                 p.next=Head;
                 Head=p;
                 current=p;
                 return;}
             
             Node<T> temp=Head;
             Node<T> pre=null;
             while(temp!=null){
                 if(((Event)temp.data).CompareTo(((Event)x).Title)<=0)
                     pre=temp;  temp=temp.next;
                        
             }
             pre.next=p;
             p.next=temp; 
             current=p;
               
           } 
           
             
}    
            
	         
	    
	    
            
