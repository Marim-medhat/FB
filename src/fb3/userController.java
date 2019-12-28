package fb3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class userController{
 static Map<String,String>user2password=new HashMap<>();
	 public boolean sign_up()
		{     Scanner s=new Scanner(System.in);
		String name, password,email,gender,country, birthdate;
		
		
			 System.out.println("enter your name : ");
			  name=s.next();
			   
	     	  System.out.println("enter your password : ");
			  password=s.next();
			  
			  System.out.println("enter your email : ");
			  email=s.next();
			 
			  System.out.println("enter your gender : ");
			  gender=s.next();
			  
			  System.out.println("enter your country : ");
			  country=s.next();
			  
			  System.out.println("enter your birthday : ");
			  birthdate=s.next();
			  if( user2password.containsKey(name))
			  {
				  System.out.println("name is taken ");
				  return false;
				  
			  }
			  else {
				  user2password.put(name, password);
				  return true;
			  }
			  
			
 
			}
	 public boolean log_in()
		{    Scanner s=new Scanner(System.in); 
		String name1; String password="";
		
		
			 System.out.println("enter your name : ");
			  name1=s.next();
			  
			 
			  
			boolean found=  user2password.containsKey(name1);
			while (true) {
			  if(found==false)
			  {
				  System.out.println("user name does not exist");
				  return false;
				
			  }
			  else
			  {
				  System.out.println("enter your password : ");
				  password=s.next(); 
				 
				 
				if(password.equals(user2password.get(name1)))
				{   
				  
				  
					 System.out.println("you are now logged in");
					  return true;
					
				}
				else
				{
					System.out.println(" your password is wrong");
					return false;
				}
		
			  }}
			 
			 
			  
			 
		}
	 
	 
	 
	 
}