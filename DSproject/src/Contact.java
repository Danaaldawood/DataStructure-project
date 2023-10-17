package phonebook;


public class Contact implements Comparable<String>{
         public String ContactName; 
	 public String phoneNumber; 
	 public String emailAddress; 
	 public String address; 
	 public String birthday; 
	 public String notes; 
         public LinkedList<Event> ListEvent;

            
	 
	    
	 public Contact(String ContactName, String phoneNumber, String emailAddress, String address, String birthday, String notes) { 
	    this.ContactName = ContactName; 
	    this.phoneNumber = phoneNumber; 
	    this.emailAddress = emailAddress; 
	    this.address = address; 
	    this.birthday = birthday; 
	    this.notes = notes;
            ListEvent=new LinkedList<Event>(); 
	        
	    } 
	   
	public String getContactName() { 
	    return ContactName ; 
	    } 
	 
        public void setContactName(String name) { 
	     ContactName = name; 
	    } 
	 
	public String getPhoneNumber() { 
	    return phoneNumber; 
	    } 
	 
	public void setPhoneNumber(String phoneNumber) { 
	    this.phoneNumber = phoneNumber; 
	    } 
	 
	public String getEmailAddress() { 
	    return emailAddress; 
	    } 
	 
	public void setEmailAddress(String emailAddress) { 
	    this.emailAddress = emailAddress; 
	    } 
	 
	public String getAddress() { 
	    return address; 
	    } 
	 
	public void setAddress(String address) { 
	    this.address = address; 
	    } 
	 
	public String getBirthday() { 
	    return birthday; 
	    } 
	 
	public void setBirthday(String birthday) { 
	    this.birthday = birthday; 
	    } 
	 
	public String getNotes() { 
	    return notes; 
	    } 
	 
	public void setNotes(String notes) { 
	   this.notes = notes; 
	    } 
            
        public LinkedList<Event> getEvent(){
            return ListEvent;
            }
        //method CompareTo receive String contact name c for the contact node in the list and compare it with the contact name for the new contact to be added and return integer to indicate the suitable arrangment for the contact node depending on the contact name.
        public int CompareTo(String c){
            
           return ContactName.compareTo(c);
           }  

    @Override
        public String toString() {
           return "Contact{" + "ContactName=" + ContactName + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress + ", address=" + address + ", birthday=" + birthday + ", notes=" + notes + '}';
    }
    
        //method addEvent receive Event object e and check the Date and Time of it if there is any conflict with other Event Date and Time(equal Date and Time for the Event e with other Event object in the  ListEvent list) return false if there is any conflict,if there is no conflict add it to the ListEvent and return true. 
        public  boolean addEvent(Event e){
           if (! ListEvent.Empty())
        {
                ListEvent.FindFirst();
                while(! ListEvent.Last() )
            {
                    if ((ListEvent.Retrive().Date.compareTo(e.Date) == 0) 
                        && (ListEvent.Retrive().Time.compareTo(e.Time) == 0))
                    return false;
                
                    ListEvent.FindNext();
            }
           
                if ((ListEvent.Retrive().Date.compareTo(e.Date) == 0) 
                        && (ListEvent.Retrive().Time.compareTo(e.Time) == 0))
                    return false;
           
        }   
           ListEvent.AddSortEvent(e);
           return true;
             
                
            
     }       
       //method RemoveEvents will remove all the Nodes in the ListEvent.          
        public void RemoveEvents(){
           if(!ListEvent.Empty()){
               ListEvent.FindFirst();
               while(!ListEvent.Last()){
                    ListEvent.Remove();
              }
               ListEvent.Remove();
               
              
          }    
              
              
      }                
              
              
              
    
    
    
    
}


