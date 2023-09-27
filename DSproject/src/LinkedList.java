public class LinkedList{ 
     
  private Contact Head; 
  private Contact current; 
   
  public LinkedList(){ 
      Head=current=null; 
  } 
   
  public boolean Empty(){ 
      return Head==null; 
  } 
  public boolean Full(){ 
      return false; 
  } 
  public boolean Last(){ 
      return current.next==null; 
  } 
  public void FindFirst(){ 
      current=Head; 
  } 
  public void FindNext(){ 
      current=current.next; 
  } 
  public void UpdateName(String name){ 
      current.setContactName(name); 
  } 
  public void UpdatePhoneNumber(String phoneNumber){ 
      current.setPhoneNumber(phoneNumber); 
  } 
  public void UpdateEmailAddress(String EmailAddress){ 
      current.setEmailAddress(EmailAddress); 
  } 
   public void UpdateAddress(String Address){ 
      current.setAddress(Address); 
  } 
    
   public void UpdateBirthday(String Birthday){ 
      current.setBirthday(Birthday); 
  } 
    public void UpdateNotes(String Notes){ 
      current.setNotes(Notes); 
  } 
     
    public String RetriveName(){ 
        return current.getContactName(); 
    } 
    public String RetrivePhoneNumber(){ 
        return current.getPhoneNumber(); 
    } 
    public String RetriveEmailAddress(){ 
        return current.getEmailAddress(); 
    } 
    public String RetriveAddress(){ 
        return current.getAddress(); 
    } 
    public String RetriveBirthday(){ 
        return current.getBirthday(); 
    } 
    public String RetriveNotes(){ 
        return current.getNotes(); 
    } 
    public void insert(String Contactname,String PhoneNumber,String EmailAddress,String Address,String Birthday,String Notes ){ 
        Contact p=new Contact(Contactname,PhoneNumber,EmailAddress,Address,Birthday,Notes); 
        if (Empty()){ 
            current=Head=p;   
        } 
        else{ 
            p.next=current.next; 
            current.next=p; 
            current=p;} 
             
        } 
    public void remove(){ 
        if(current==Head){ 
          Head=Head.next; 
        } 
         
        else{ 
            Contact p=Head; 
            while(p.next!= current) 
                p=p.next; 
             
            p.next=current.next; 
        } 
            if(current.next==null) 
                current=Head; 
         
            else 
                current=current.next; 
                 
        } 
         
    public LinkedList SearchByName(String name){ 
            LinkedList list =new LinkedList(); 
            Contact temp=Head; 
            while(temp!=null){ 
                if(temp.getContactName().equals(name)) 
                    list.insert(temp.getContactName(), temp.getPhoneNumber(), temp.emailAddress, temp.getAddress(), temp.getBirthday(), temp.getNotes()); 
                    temp=temp.next; 
            } 
             
             
           return list;  
             
        } 
    public LinkedList SearchByPhoneNumber(String PhoneNumber){ 
            LinkedList list =new LinkedList(); 
            Contact temp=Head; 
            while(temp!=null){ 
                if(temp.getContactName().equals(PhoneNumber)) 
                    list.insert(temp.getContactName(), temp.getPhoneNumber(), temp.emailAddress, temp.getAddress(), temp.getBirthday(), temp.getNotes()); 
                    temp=temp.next; 
            } 
             
             
           return list;  
             
        } 
    public LinkedList SearchByEmailAddress(String EmailAddress){ 
            LinkedList list =new LinkedList(); 
            Contact temp=Head; 
            while(temp!=null){ 
                if(temp.getEmailAddress().equals(EmailAddress)) 
                    list.insert(temp.getContactName(), temp.getPhoneNumber(), temp.emailAddress, temp.getAddress(), temp.getBirthday(), temp.getNotes()); 
                    temp=temp.next; 
            } 
             
             
           return list;  
             
        } 
    public LinkedList SearchByAddress(String Address){ 
        LinkedList list =new LinkedList(); 
        Contact temp=Head; 
        while(temp!=null){ 
            if(temp.getAddress().equals(Address)) 
                list.insert(temp.getContactName(), temp.getPhoneNumber(), temp.emailAddress, temp.getAddress(), temp.getBirthday(), temp.getNotes()); 
                temp=temp.next; 
        } 
         
         
       return list;  
         
    } 
public LinkedList SearchByBirthday(String Birthday){ 
        LinkedList list =new LinkedList(); 
        Contact temp=Head; 
        while(temp!=null){ 
            if(temp.getBirthday().equals(Birthday)) 
                list.insert(temp.getContactName(), temp.getPhoneNumber(), temp.emailAddress, temp.getAddress(), temp.getBirthday(), temp.getNotes()); 
                temp=temp.next; 
        } 
         
         
       return list;  
         
    }}