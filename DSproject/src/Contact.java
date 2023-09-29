package dataStructure;

public class Contact <T> { 
	 public T ContactName; 
	 public T phoneNumber; 
	 public T emailAddress; 
	 public T address; 
	 public T birthday; 
	 public T notes; 
	 
	 
	    public Contact(T ContactName, T phoneNumber, T emailAddress, T address, T birthday, T notes) { 
	        this.ContactName = ContactName; 
	        this.phoneNumber = phoneNumber; 
	        this.emailAddress = emailAddress; 
	        this.address = address; 
	        this.birthday = birthday; 
	        this.notes = notes; 
	        
	    } 
	   
	    public T getContactName() { 
	        return ContactName ; 
	    } 
	 
	    public void setContactName(T name) { 
	        ContactName = name; 
	    } 
	 
	    public T getPhoneNumber() { 
	        return phoneNumber; 
	    } 
	 
	    public void setPhoneNumber(T phoneNumber) { 
	        this.phoneNumber = phoneNumber; 
	    } 
	 
	    public T getEmailAddress() { 
	        return emailAddress; 
	    } 
	 
	    public void setEmailAddress(T emailAddress) { 
	        this.emailAddress = emailAddress; 
	    } 
	 
	    public T getAddress() { 
	        return address; 
	    } 
	 
	    public void setAddress(T address) { 
	        this.address = address; 
	    } 
	 
	    public T getBirthday() { 
	        return birthday; 
	    } 
	 
	    public void setBirthday(T birthday) { 
	        this.birthday = birthday; 
	    } 
	 
	    public T getNotes() { 
	        return notes; 
	    } 
	 
	    public void setNotes(T notes) { 
	        this.notes = notes; 
	    } 
	     
	     
     
     
     
  
  
  
  
     
     
     
     
     
     
     
     
}
