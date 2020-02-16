package testone;

import java.util.Scanner;

public class Usertest {
	 public static void main(String[] args) {  

	    	UserDemo p=new UserDemo();

	        Scanner input=new Scanner(System.in);  

	  

	        while( true ){  
	            System.out.println("请选择功能:\n1.新用户注册\n2.用户登陆");  

	            int select = input.nextInt();          

	            switch(select) {  

	            case 1:p.Registered();break;  

	            case 2:p.Login();break;  

	            default:System.out.println("wrong number please try agin!");  

	            }     

	        }  }
}
