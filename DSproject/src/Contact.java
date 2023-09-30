package dataStructure;

public class Contact { 
	 public String ContactName; 
	 public String phoneNumber; 
	 public String emailAddress; 
	 public String address; 
	 public String birthday; 
	 public String notes; 
	 
	 
	    public Contact(String ContactName, String phoneNumber, String emailAddress, String address, String birthday, String notes) { 
	        this.ContactName = ContactName; 
	        this.phoneNumber = phoneNumber; 
	        this.emailAddress = emailAddress; 
	        this.address = address; 
	        this.birthday = birthday; 
	        this.notes = notes; 
	        
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
	     
	     
     
     
     
     
     
     
     
     
     
     
}
