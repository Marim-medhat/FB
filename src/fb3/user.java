package fb3;

import java.util.Vector;

public class  user {
	
		String name,password,email,gender,country,birthDate;
		 Vector<String> FRsent=new Vector();
		 Vector<String> FRrecieved =new Vector();
		//Map<String,Vector<String>>FRsent=new HashMap<>();
	//	Map<String,Vector<String>>FRrecieved=new HashMap<>();

		
	  boolean	premiuim =false;
		
		
		public user(String name, String password,String email,String gender,String country,String birthDate)
		{    this.name=name;
			 this.password=password;
			 this.email=email;
			 this.gender=gender;
			 this.country=country;
			 this.birthDate=birthDate;
			
		}
		
		public user(String name, String password)
		{
			this.name=name;
			 this.password=password;
		}
	}

	