package exception;

import java.util.Scanner;
public class PersonTest {
	
	private static Scanner input;
	void Person(String Name,String Sex,int Age) {
	}
	public static  void  main(String[] args) {
		// TODO Auto-generated method stub
		
		input =new Scanner(System.in);
        System.out.println("������������"); 
        String Name1 = input.nextLine(); 
        String Name2 = input.nextLine(); 
        System.out.println("�������Ա�");
        String Sex1 = input.next(); 
        String Sex2 = input.next(); 
        System.out.println("���������䣺"); 
        int Age1 = input.nextInt(); 
        int Age2 = input.nextInt(); 
        Person p1=new Person(Name1,Sex1,Age1);
        Person p2=new Person(Name2,Sex2,Age2);
        
		try {
			if(Sex1.equals("male")||Sex1.equals("female"))
				if(Sex2.equals("male")||Sex2.equals("female"))
			  throw new SexException("�Ա����Ϊmale��female");
		  else
			  System.out.println("������"+Name1+"\n"+"�Ա�"+Sex1+"\n"+"���� :"+Age1); 
			 System.out.println("������"+Name2+"\n"+"�Ա�"+Sex2+"\n"+"���� :"+Age2); 
		  if (Age1>120||Age1<0)
			  throw new SexException("���������1~120֮��!");
		  else
			  System.out.println("������"+Name1+"\n"+"�Ա�"+Sex1+"\n"+"���� :"+Age1); 
		  System.out.println("������"+Name2+"\n"+"�Ա�"+Sex2+"\n"+"���� :"+Age2); 
		}
		
		catch(SexException e) {
			System.out.println("�����쳣��catch��䲶�����쳣");
			System.out.println("������쳣Ϊ"+e);
			 
		}
			
       finally {
	        System.out.println("��������catch�鹲�еĲ���");
			System.out.println("try-catch-finally��������");
			 }
	}
	
		
	}
	 class SexException extends Exception{
     	public SexException() {
     	}

     	public SexException(String message) {
     	super(message);
     	}
     	}
     	    class Person {
     	      String Name;
     		  String Sex;
     		  int Age;
     		  
     		public Person(String name1, String sex1, int age1) {
     			// TODO Auto-generated constructor stub
     		}

  public void doPerson  (String Name,String Sex,int Age)throws SexException{
		  
		 
		}
	  }
	   





    



