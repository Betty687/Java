package count;

    public class complexnumber{
	public double real1=0,image1=0, real2=0,image2=0;
 complexnumber(double real1,double image1,double real2,double image2){
        this.real1=real1;
		this.image1=image1;
        this.real2=real2;
		this.image2=image2;
     }
	
	public double add1() {
		
	double newreal=real1+real2;
	
	
	{return newreal;}
	}
	public double add2() {
		double newimage=image1+image2;
		{return newimage;}
    }
	public double sub1() {
		
		double newreal=real1-real2;
		
		
		{return newreal;}
		}
		public double sub2() {
			double newimage=image1-image2;
			{return newimage;}
	    }
    
public double mul1() {
		
		double newreal=real1*real2-image1*image2;
		
		
		{return newreal;}
		}
		public double mul2() {
			double newimage=image1*real2-real1*image2;
			{return newimage;}
	    }
public double div1() {
		
		double newreal=(real1*real2+image1*image2)/(real2*real2+image2*image2);
		
		
		{return newreal;}
		}
		public double div2() {
			double newimage=(image1*real2-real1*image2)/(real2*real2+image2*image2);
			{return newimage;}
	    }
    }
	
