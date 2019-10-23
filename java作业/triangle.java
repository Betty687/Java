package exception;
import java.util.Scanner;
public class triangle {
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		input =new Scanner(System.in);
		System.out.println("请输入三边各长："); 
	    double a =input.nextDouble(); 
	    double b =input.nextDouble(); 
	    double c= input.nextDouble();
	    triangle t=new triangle();
	    double p,C;
	    p=(a+b+c)/2;
		C=a+b+c;
		
        try { if(a+b<c||a+c<b||b+c<a) 
        throw  myException();
			
		else
				System.out.println("该三角形周长为"+C);
        System.out.println("该三角形面积为"+Math.sqrt(p*(p-a)*(p-b)*(p-c)));
        }
       catch(myException e) {
    	   System.out.println("处理三角形异常的catch语句捕获到了异常");
			System.out.println("捕获的异常为"+e);
			e.printStackTrace();
       }
        finally {
	        System.out.println("这是所有catch块共有的部分");
			System.out.println("try-catch-finally后面的语句");
			 }
       }
	
private static Exception myException() {
		// TODO Auto-generated method stub
		return null;
	}

private static Scanner input;

	
	class myException extends Exception{
		public myException() {
		}
	public myException(String message) {
	super(message);
	}
	public void domyException ()throws myException{
		
			
	}	
		}
		
	}
	

