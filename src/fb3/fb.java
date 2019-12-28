package fb3;

import java.util.Scanner;

public class fb {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        userController us = new userController();

        boolean active = false;
        System.out.println("welcome,what would you do ?");
        while (true) {
            int ch = 0;
            while (true) {
                System.out.println("1-sign up");
                System.out.println("2-sign in");
                System.out.println("3-exit");
                ch = in.nextInt();
                if (ch == 1) {
                    us.sign_up();
                    if()
                    active = true;

                } else if (ch == 2) {
                    us.log_in();
                    active = true;
                }

                if (active == true) {
                    System.out.println("end of this session");
                    break;
                } else if (ch == 3) {
                    System.out.println("end of this session & exit");
                    break;
                } else {
                    System.out.println("wrong option , try again!");
                }

            }

            /*if(active==true)
             {  while (true) {
             System.out.println("1-send friend request ");
             System.out.println("2-accept friend request");
             System.out.println("3-join premiuim subspriction");
             System.out.println("4-log out");
			 
             ch=in.nextInt();
             if(ch==1)
             {
             user userobj=new user();
             ui.send_friend_request();
             }
             else  if(ch==2)
             {
             user userobj=new user();
             ui.accept_request(); 
             }
             else  if(ch==3)
             {
             user userobj=new user();
             ui.upgradeSubscription(); 
             }
			 
             else  if(ch==4)
             {
             active=false;
             break;
             }
             else
             {
             System.out.println("wrong option , try again!");
             }
			  
             }
             }*/
		//System.out.println("wrong option , try again!");
        }

    }

}
