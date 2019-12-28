
public interface ui {
	
	 public boolean sign_up();
	 public boolean log_in();
	 public boolean send_friend_request();
	 public  void upgradeSubscription();
	 public void sign_up_on_paypal();
	 public void sign_in_on_paypal();
     public void show_friend_request( user x);
 	 public  boolean accept_request( user x);

}
