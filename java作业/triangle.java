package exception;
import java.util.Scanner;
public class triangle {
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		input =new Scanner(System.in);
		System.out.println("���������߸�����"); 
	    double a =input.nextDouble(); 
	    double b =input.nextDouble(); 
	    double c= input.nextDouble();
	    triangle t=new triangle();
	    double p,C;
	    p=(a+b+c)/2;
		C=a+b+c;
		
        try { if(a+b<c&&a+c<b&&b+c<a) 
        throw  myException();
			
		else
				System.out.println("���������ܳ�Ϊ"+C);
        System.out.println("�����������Ϊ"+Math.sqrt(p*(p-a)*(p-b)*(p-c)));
        }
       catch(myException e) {
    	   System.out.println("�����������쳣��catch��䲶�����쳣");
			System.out.println("������쳣Ϊ"+e);
			e.printStackTrace();
       }
        finally {
	        System.out.println("��������catch�鹲�еĲ���");
			System.out.println("try-catch-finally��������");
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
	

