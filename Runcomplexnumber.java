package count;

import java.util.Scanner;

public  class Runcomplexnumber {
	private static Scanner input;
    public static void main(String[] args) {
   input =new Scanner(System.in);
   double real1=input.nextDouble();
   double real2=input.nextDouble();
   double image1=input.nextDouble();
    double image2=input.nextDouble();
    
	complexnumber p1=new complexnumber(real1,real2,image1,image2);
	System.out.println("new="+p1.add1()+"+("+p1.add2()+"i)");
	System.out.println("new="+p1.sub1()+"+("+p1.sub2()+"i)");
	System.out.println("new="+p1.mul1()+"+("+p1.mul2()+"i)");
	System.out.println("new="+p1.div1()+"+("+p1.div2()+"i)");
	}
}
	
	

