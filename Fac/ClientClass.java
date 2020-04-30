package Fac;

public class ClientClass {
	
	public String factory (String fruitname)
	{
		if(fruitname.equals("Apple"))
			return "Apple";
		if(fruitname.equals("Banana"))
			return "Banana";
		return null;
	}

public static void main(String[] args) {
	Factory factor=new Factory();
	Fruit fruit=factor.CreateFruit("A");
	fruit.eat();
}
}