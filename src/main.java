import java.util.Scanner;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean active=false;
		ui ui=new ucproxy();
	
		
				 
				 
				   if(ui.sign_up()==true) {
			System.out.println("you have an account now,pls log in to access it");
				   }
				   
				 
				   if(ui.sign_up()==true) {
			System.out.println("you have an account now,pls log in to access it");
				   }
		
				 
				   if( ui.log_in()==true)
				   {
				   active = true;
				 }
		
				  
				   
				   if(active == true)
				   {
					   ui.send_friend_request();
					   ui.upgradeSubscription();
				   }
				 
		
	
	
		
		
	
		
		
	

	}

}
