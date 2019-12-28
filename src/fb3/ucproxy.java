
public class ucproxy implements ui {

public userController obj=new  userController();

	@Override
	public boolean sign_up() {
		//if(obj==null)
		//{
			obj=new userController ();
		//}
		return obj. sign_up();
	}

	@Override
	public boolean log_in() {
		// TODO Auto-generated method stub
		if(obj==null)
		{
			obj=new userController ();
		}
		return obj.log_in();
	}

	@Override
	public boolean send_friend_request() {
		// TODO Auto-generated method stub
		if(obj==null)
		{
			obj=new userController ();
		}
		 return obj.send_friend_request();
	}

	@Override
	public void upgradeSubscription() {
		// TODO Auto-generated method stub
		if(obj==null)
		{
			obj=new userController ();
		}
		obj.upgradeSubscription();
		
	}

	@Override
	public void sign_up_on_paypal() {
		// TODO Auto-generated method stub
		if(obj==null)
		{
			obj=new userController ();
		}
	obj.	sign_up_on_paypal();
	}

	@Override
	public void sign_in_on_paypal() {
		// TODO Auto-generated method stub
		if(obj==null)
		{
			obj=new userController ();
		}
		obj.	sign_in_on_paypal();
		
	}

	@Override
	public void show_friend_request(user x) {
		// TODO Auto-generated method stub
		if(obj==null)
		{
			obj=new userController ();
		}
		obj.show_friend_request( x);
		
	}

	@Override
	public boolean accept_request(user x) {
		// TODO Auto-generated method stub
		if(obj==null)
		{
			obj=new userController ();
		}
		 return obj.	accept_request( x);
		
	}

}
