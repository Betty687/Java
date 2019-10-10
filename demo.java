import Animals.Bird;
import Animals.Tiger;
import Animals.animals;
public  class demo {

	public static void main(String[] args) {
		animals []arrzoo=new animals[3];
		arrzoo[0]=new Bird();
		arrzoo[1]=new Tiger();
		arrzoo[2]=new Tiger();
		for(int i=0;i<arrzoo.length;i++)
			{
				System.out.println();
			     arrzoo[i].run();
			}
		for(animals a:arrzoo)
		{
			System.out.println();
			a.eat();
		}
	}
}

