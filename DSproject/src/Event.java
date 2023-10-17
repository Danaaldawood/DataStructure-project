
package phonebook;

public class Event implements Comparable<String> {
   
public String Title; 
public String Date; 
public String Time; 
public String Location;
public Contact contact;


 
 
    public Event(String Title, String Date, String Time, String Location,Contact c) { 
        this.Title = Title; 
        this.Date = Date; 
        this.Time = Time; 
        this.Location = Location;
        contact=c;
        
    }

    @Override
    public String toString() {
        return "Event{" + "Title=" + Title + ", Date=" + Date + ", Time=" + Time + ", Location=" + Location + ", contact name=" + contact.ContactName + '}';
    }
    

    public int CompareTo( String c){
            
           return Title.compareTo(c);
           }  

    public String getTitle() {
        return Title;
    }

   



}


    


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
