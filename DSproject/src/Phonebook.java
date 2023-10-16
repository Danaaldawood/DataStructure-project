
package phonebook;
import java.util.Scanner;

public class Phonebook { 
public static LinkedList<Contact> list;
public static LinkedList<Event> Elist;
 
 static Scanner read=new Scanner(System.in);
    public static void main(String[] args) {
     System.out.println("Welcome to the Linked Tree Phonebook!");
     Phonebook ph=new Phonebook();
     int ch=0;  String str; Contact contact;
     do{
       System.out.println("Please choose an option:") ;
       System.out.println("1. Add a contact");
       System.out.println("2. Search for a contact"); 
       System.out.println("3. Delete a contact");  
       System.out.println("4. Schedule an event");  
       System.out.println("5. Print event details");  
       System.out.println("6. Print contacts by first name");    
       System.out.println("7. Print all events alphabetically");    
       System.out.println("8. Exit"); 
       System.out.println();
       System.out.println("Enter your choice:");  
       ch=read.nextInt();
       switch(ch){
           case 1:
               System.out.print("Enter the contact's name:");
               read.nextLine();
               String name=read.nextLine();
               System.out.print("Enter the contact's phone number:");
               read.nextLine();
               String phoneNumber=read.nextLine();
               System.out.print("Enter the contact's email address:");
               read.nextLine();
               String email=read.nextLine();
               System.out.print("Enter the contact's address: ");
               read.nextLine();
               String address=read.nextLine();
               System.out.print("Enter the contact's birthday: ");
               read.nextLine();
               String birthday=read.nextLine();
               System.out.print("Enter any notes for the contact: ");
               read.nextLine();
               String note=read.nextLine();
               
           
              Contact c=new Contact(name,phoneNumber,email,address,birthday,note);
              ph.Insert(c);
              break;
              
           case 2:
              int s=0;
              System.out.println("Enter search criteria:");
              System.out.println("1. Name");
              System.out.println("2. phonenumber");
              System.out.println("3. Email Address");
              System.out.println("4. Address");
              System.out.println("5. birthday");
              System.out.println();
              System.out.println("Enter your choice:");
              
              s=read.nextInt();
              
             
              LinkedList<Contact> l;
              switch(s){
                  
                  case 1:
                      System.out.print("Enter the contact's name:");
                      read.nextLine();
                      str=read.nextLine();
                      contact= ph.SearchName(str);
                     if(contact!=null){
                         System.out.println("Contact found!");
                         System.out.println(contact);
                     }
                     else
                         System.out.println("Contact not found!");
                     break;
                     
                  case 2:
                      System.out.print("Enter the contact's Phone Number:");
                      read.nextLine();
                      str=read.nextLine();
                     contact= ph.SearchName(str);
                     if(contact!=null){
                         System.out.println("Contact found!");
                         System.out.println(contact);
                     }
                     else
                         System.out.println("Contact not found!");
                     break;
                          
                  case 3:
                      System.out.print("Enter the contact's email:");
                      read.nextLine();
                      str=read.nextLine();
                      l= ph.SearchEmail(str);
                      if(l.Empty())
                          System.out.println("there are no contacts matching with this email!");
                      else{
                          l.FindFirst();
                          while(!l.Last()){
                              System.out.println(l.Retrive());
                              l.FindNext();
                          }
                          System.out.println(l.Retrive());
                          
                          
                      }
                      break;
                      
                  case 4:
                       System.out.print("Enter the contact's address:");
                       read.nextLine();
                       str=read.nextLine();
                       l= ph.SearchAddress(str);
                      if(l.Empty())
                          System.out.println("there are no contacts matching with this address!");
                      else{
                          l.FindFirst();
                          while(!l.Last()){
                              System.out.println(l.Retrive());
                              l.FindNext();
                          }
                          System.out.println(l.Retrive());
                          
                          
                      }
                      break;
                      
                  case 5:
                       System.out.print("Enter the contact's birthday:");
                       read.nextLine();
                       str=read.nextLine();
                       l= ph.SearchBirthday(str);
                      if(l.Empty())
                          System.out.println("there are no contacts matching with this birthday!");
                      else{
                          l.FindFirst();
                          while(!l.Last()){
                              System.out.println(l.Retrive());
                              l.FindNext();
                          }
                          System.out.println(l.Retrive());
                          
                          
                      }
                      break;
                          
                 }// end search switch

           
           break;
           
           //case 3:
               //System.out.println("enter contact name you want to delete:");
               //read.nextLine();
              // str=read.nextLine();
               
           case 4:
               System.out.print("Enter event title:");
               read.nextLine();
               String title=read.nextLine();
               System.out.println("Enter contact name:");
               read.nextLine();
               String contactname=read.nextLine();
               System.out.println("Enter event date and time (MM/DD/YYYY HH:MM):");
               read.nextLine();
               String dateTime=read.nextLine();
               String date=dateTime.substring(0,dateTime.indexOf(' '));
               String time=dateTime.substring(dateTime.indexOf(' '));        
               System.out.println("Enter event location:");
               read.nextLine();
               String loc=read.nextLine();
                contact= ph.SearchName(contactname);
                     if(contact==null){
                        System.out.println("no contact with this name!");
                     }
                     else{
                       Event event=new Event(title,date,time,loc,contact);  
                       Elist.AddSortEvent(event);
                      if( contact.addEvent(event))
                          System.out.println("Event scheduled successfully!");
                      else
                           System.out.println("Event scheduled Unsuccessfully!");
                     }   
                         
            break;
            
           case 5:
               System.out.println("Enter search criteria:");
               System.out.println("1. contact name");
               System.out.println("2. Event tittle");
               System.out.println();
               System.out.print("Enter your choice:");

               int i=0;
               switch(i)
               {
                   case 1:
                     System.out.println("enter contact name:");
                     read.nextLine();
                     str=read.nextLine();
                     ph.PrintByContactName(str);
                   
                   
               }                         
                    
                     
                     
               
               
           
           
           
       
       
       
       
       
       
       
       
       
           
           
           
           
           
           
           
           
       }//end switch   
     }while(ch!=8);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    public void Insert(Contact x){
     boolean flag=false;
    list.FindFirst();
   while(!list.Last()){
      
    if (list.Retrive() .getContactName().equals(x.getContactName())||list.Retrive().getPhoneNumber().equals(x.getPhoneNumber())) {
     flag=true;  
    }
list.FindNext();

   }
   
   if (list.Retrive() .getContactName().equals(x.getContactName())||list.Retrive().getPhoneNumber().equals(x.getPhoneNumber())) {
     flag=true; 
    }
   
   if(flag==false){
    list.AddSortContact(x);
    System.out.println("Contact added successfully!");
   }
   else 
        System.out.println("Contact Not added successfully!");
 
}
 
 
 public Contact SearchName(String name){
     Contact c=null;
      if(list.Empty())
         return c;
     list.FindFirst();
     while(!list.Last()){
         if(( (Contact) list.Retrive()).getContactName().equals(name))
            return (Contact)list.Retrive(); 
         list.FindNext();
     }
      if(( (Contact) list.Retrive()).getContactName().equals(name))
             return (Contact)list.Retrive(); 
     return c;
 }
 
 public Contact SearchPhoneNum(String phonenum){
     Contact c=null;
      if(list.Empty())
         return c;
     list.FindFirst();
     while(!list.Last()){
         if(( (Contact) list.Retrive()).getPhoneNumber().equals(phonenum))
             return (Contact)list.Retrive(); 
         list.FindNext();
     }
     if(( (Contact) list.Retrive()).getPhoneNumber().equals(phonenum))
             return (Contact)list.Retrive(); 
     return c;
 }
 
 public LinkedList<Contact> SearchEmail(String email){
     LinkedList<Contact> l=new LinkedList<Contact>();
     if(list.Empty())
         return l;
     list.FindFirst();
     while(!list.Last()){
         if(( (Contact) list.Retrive()).getEmailAddress().equals(email))
             l.Insert(list.Retrive());
         
         list.FindNext();   
     }
      if(( (Contact) list.Retrive()).getEmailAddress().equals(email))
             l.Insert(list.Retrive());
      
      return l;  
 }
 
  public LinkedList<Contact> SearchAddress(String address){
     LinkedList<Contact> l=new LinkedList<Contact>();
     if(list.Empty())
         return l;
     list.FindFirst();
     while(!list.Last()){
         if(( (Contact) list.Retrive()).getAddress().equals(address))
             l.Insert(list.Retrive());
         
         list.FindNext();   
     }
      if(( (Contact) list.Retrive()).getAddress().equals(address))
             l.Insert(list.Retrive());
      
      return l;  
 }
  
  
  public LinkedList<Contact> SearchBirthday(String birthday){
     LinkedList<Contact> l=new LinkedList<Contact>();
     if(list.Empty())
         return l;
     list.FindFirst();
     while(!list.Last()){
         if(( (Contact) list.Retrive()).getBirthday().equals(birthday))
             l.Insert(list.Retrive());
         
         list.FindNext();   
     }
      if(( (Contact) list.Retrive()).getBirthday().equals(birthday))
             l.Insert(list.Retrive());
      
      return l;  
 }
  
  
  public void DeleteContact(Contact c){
      if(list.Empty()){
       System.out.println("list is Empty!");
      }
      else{
        c.RemoveEvents();
        list.FindFirst();
        while(!list.Last()){
            if(list.Retrive()!=c)
                list.FindNext();
        }
        list.Remove();
         System.out.println("Contact deleted successfully!");  
      }    
  }
  
  
  public void PrintFirstName(String name){
      LinkedList<Contact> l=new LinkedList<Contact>();
      if(!list.Empty()){
         
      
       list.FindFirst();
     while(!list.Last()){
         
         if(( (Contact) list.Retrive()).getContactName().substring(0,( (Contact) list.Retrive()).getContactName().indexOf(' ')).equals(name))
             l.Insert(list.Retrive());
         list.FindNext();
     }
      if(( (Contact) list.Retrive()).getContactName().substring(0,( (Contact) list.Retrive()).getContactName().indexOf(' ')).equals(name))
             l.Insert(list.Retrive());
      }
     if(l.Empty())
         System.out.println("contacts not found!");
     else{
         System.out.println("contacts found!");
         l.FindFirst();
     while(!l.Last()){
         System.out.println(l.Retrive().toString());
         l.FindNext();
     }
     
         System.out.println(l.Retrive().toString());
      }       
  }
  
  public void PrintByTitle(String title){
      if(Elist.Empty())
          System.out.println("List is empty!");
      else{
      Elist.FindFirst();
      while(!Elist.Last()){
          if(Elist.Retrive().Title.equals(title))
              System.out.println (Elist.Retrive().toString());
          Elist.FindNext();
      }
      if(Elist.Retrive().Title.equals(title))
              System.out.println (Elist.Retrive().toString());
      }
      
  }
  
  public void PrintByContactName(String name){
      
      
      
      
      
      
      
      
      
      
      
      
      
      
  }
      
  public void PrintInOrder(){
     if(Elist.Empty())
        System.out.println("List is empty!");
     else{
        int i=0;
        Elist.FindFirst();
        while(!Elist.Last()){
            i++;
            Elist.FindNext();
        }
        i++;
        for(int j=0;j<i;j++){
            Elist.FindFirst();
            System.out.println(Elist.Retrive().toString());
            Elist.FindNext();
        }
        
        
        
     }
  }
                 
      
      
      
      
      
      
   /* if(Elist.Empty())
          System.out.println("List is empty!");
      else{
          
      Elist.FindFirst();
      while(!Elist.Last()){
          if(Elist.Retrive().contact.ContactName.equals(name))
             System.out.println (Elist.Retrive().toString());
          Elist.FindNext();
      }
      
      if(Elist.Retrive().contact.ContactName.equals(name))
             System.out.println (Elist.Retrive().toString());
      }    
  */
      
      
      
      
      
  
  
  
  
  
  
  
  
 
 
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
