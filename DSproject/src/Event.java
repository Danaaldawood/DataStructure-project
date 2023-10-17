
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
    
 //method CompareTo receive String Title c for the Event node in the list and compare it with the Title for the new Event to be added and return integer to indicate the suitable arrangment for the Event node depending on the Title.
         public int CompareTo( String c){
            
            return Title.compareTo(c);
           }  

         public String getTitle() {
            return Title;
    }

   



}


    


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
