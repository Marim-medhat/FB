package fb3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class userController{
  static Map<String,String>user2password=new HashMap<>();
	 public static Vector <user> users=new Vector();
	 public Vector <String> p=new Vector();
	 public  user user=new user("","","","","","");
	 public static user user1=new user("","");
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
				  user=new user(name,password,email,gender,country,birthdate);
				  
				  users.add(user);
				  for(user x : users)
				  {
					  System.out.println(x.name);}
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
				   user1=new user (name1,password);
				  
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
	 public void send_friend_request()
		{
			String name1;
			int i =0;
			
			 System.out.println("search for friends: ");
			 Scanner s=new Scanner(System.in);
			  name1=s.next();
			  
			 
			  
			boolean found=  user2password.containsKey(name1);
			  if(found==false)
			  {
				  System.out.println("user name does not exist");
			  }
			  else
			  {  for( i =0;i<users.size();i++)
			  {  System.out.println();
				  if(users.get(i).name.equals(name1))
				  { 
					  users.get(i).FRrecieved.add(user1.name);
					  user1.FRsent.add(name1);
					
					 System.out.println(users.get(i).FRrecieved);
					 
					
					  System.out.println("request sent!");
					  break;
				  }
			  }}
			  
			  for(user x : users)
			  {
				  System.out.println(x.name);
				  System.out.println(x.FRrecieved);
				  System.out.println(x.FRsent);
			  }
			  
			  show_friend_request(users.get(i) ) ; 
			  
			  accept_request( users.get(i));
		}
	 
		public void show_friend_request( user x)
		{    
			System.out.println("you have friend request from: ");
			if(x.FRrecieved.size()!=0)
			{	for(int i =0;i<x.FRrecieved.size();i++)
			{
				System.out.println(i+":"+ x.FRrecieved.get(i));
			}}
			else
			{
				System.out.println(" no one ");
			}

		}
		public  void accept_request( user x)
		
		{
			
		
			 
				
			if(user.FRrecieved.size()!=0)
			{  while (true)
			 {
				System.out.println("1-accept or 2-decline or 3-to exit friend requets list");
				{Scanner s=new Scanner(System.in); 
				 int choice =s.nextInt();
				 if(choice==1)
				 {  System.out.println("enter request number");
					 int n =s.nextInt();
					 user.FRrecieved.remove(user.FRrecieved.get(n));
					// friends.add(senderName.get(n));
					 System.out.println("you have a new friend!");
					 
				 }
				 else if(choice==2)
				 {
					 System.out.println("enter request number");
					 int n =s.nextInt();
					 user.FRrecieved.remove(user.FRrecieved.get(n));
					 System.out.println("this request has been deleted!");
				 }
				 else if(choice==3)
				 {
					 break;
				 }
				 else
				 {
					 System.out.println("wrong option,try again!");
				 }
					
				}}}}
		
		
		public void sign_up_on_paypal()
		{
			 Scanner s=new Scanner(System.in);
			 String name,password,email;
				
			 System.out.println("enter your name : ");
			  name=s.next();
			  
			  System.out.println("enter your email : ");
			  email=s.next();
			  
			  System.out.println("enter your password: ");
			 password=s.next();
			 
		}
		public void sign_in_on_paypal()
		{    Scanner s=new Scanner(System.in);
		  String name,password;
		
			 System.out.println("enter your name : ");
			  name=s.next();
			  
			  System.out.println("enter your password: ");
				 password=s.next();
			  
			
		}
		
		
		
		public  void upgradeSubscription()
		{ String Name,ccNo,ccPass;
		  
			
		
		if(!p.contains(user1.name))
		 {
		
			 {System.out.println("get a premium subscription and enjoy extra options for 99$ per year, "
			 		+ "choose 1 to proceed  ");
			 Scanner s=new Scanner(System.in);
			 int choice=s.nextInt();
			  if(choice==1)
			  {   
				  System.out.println("how do you like to pay?");
			   System.out.println("1-credit card or 2-paypal");
			
			   int c=s.nextInt();
			   if(c==1)
			   {  while (true) {
				   System.out.println("enter your credit card number");
				   ccNo=s.next();
				   
				   System.out.println("enter your credit card password");
				   ccPass=s.next();
				  user1.premiuim=true;
				  p.add(user1.name);
				   System.out.println("your are now premiuim"); 
				   if(ccNo.length()<=16 || ccPass.length()<=6)
				   {
					   System.out.println("please complete your info");  
				   }
				   
				   else
				   { 
					  break;
				   }
			
			   }
			   
			 
			   }
			   if(c==2)
			   {
				   System.out.println("1-sign in or 2-sign up ");
				  
					 int choice2=s.nextInt();
					 if(choice2==2)
					 {
						 sign_up_on_paypal();
						  user1.premiuim=true;
						  p.add(user1.name);
						   System.out.println("your are now premiuim"); 
						
						 
					 }
					 else if (choice2==1)
					 {
						 sign_in_on_paypal(); 
						 user1.premiuim=true;
						 p.add(user1.name);
						   System.out.println("your are now premiuim"); 
						
						
					 }
			   }
			 
			  }} }
		}
	 
	 
	 
	 
}



