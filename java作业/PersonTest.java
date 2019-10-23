package exception;

import java.util.Scanner;
public class PersonTest {
	
	private static Scanner input;
	void Person(String Name,String Sex,int Age) {
	}
	public static  void  main(String[] args) {
		// TODO Auto-generated method stub
		
		input =new Scanner(System.in);
        System.out.println("请输入姓名："); 
        String Name1 = input.nextLine(); 
        String Name2 = input.nextLine(); 
        System.out.println("请输入性别：");
        String Sex1 = input.next(); 
        String Sex2 = input.next(); 
        System.out.println("请输入年龄："); 
        int Age1 = input.nextInt(); 
        int Age2 = input.nextInt(); 
        Person p1=new Person(Name1,Sex1,Age1);
        Person p2=new Person(Name2,Sex2,Age2);
        
		try {
			if(Sex1.equals("male")||Sex1.equals("female"))
				if(Sex2.equals("male")||Sex2.equals("female"))
			  {  System.out.println("姓名："+Name1+"\n"+"性别："+Sex1+"\n"+"年龄 :"+Age1); 
			 System.out.println("姓名："+Name2+"\n"+"性别："+Sex2+"\n"+"年龄 :"+Age2); }
		  else
		  throw new SexException("性别必须为male或female");
		  if (Age1>120||Age1<0)
			   { System.out.println("姓名："+Name1+"\n"+"性别："+Sex1+"\n"+"年龄 :"+Age1); 
		  System.out.println("姓名："+Name2+"\n"+"性别："+Sex2+"\n"+"年龄 :"+Age2); }
		  else
			throw new SexException("年龄必须在1~120之间!");
		}
		
		catch(SexException e) {
			System.out.println("处理异常的catch语句捕获到了异常");
			System.out.println("捕获的异常为"+e);
			 
		}
			
       finally {
	        System.out.println("这是所有catch块共有的部分");
			System.out.println("try-catch-finally后面的语句");
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
	   





    



