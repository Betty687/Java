package testone;

import java.util.Scanner;

public class Usertest {
	 public static void main(String[] args) {  

	    	UserDemo p=new UserDemo();

	        Scanner input=new Scanner(System.in);  

	  

	        while( true ){  
	            System.out.println("��ѡ����:\n1.���û�ע��\n2.�û���½");  

	            int select = input.nextInt();          

	            switch(select) {  

	            case 1:p.Registered();break;  

	            case 2:p.Login();break;  

	            default:System.out.println("wrong number please try agin!");  

	            }     

	        }  }
}
