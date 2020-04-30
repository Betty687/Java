package Ada;

import Sig.MyFruitStore;
import yuanxing.Apple;
import yuanxing.Banana;
import yuanxing.MyFruit;

public class ClientClass {
	public static void main(String[] args) {
		MyFruit fru1=new Apple();
		MyFruit fru2=new Banana();
		MyFruitStore mfs1=MyFruitStore.Getfruitstore();
		mfs1.Add(1, fru1);
		mfs1.Add(2, fru1);
		mfs1.Add(3, new Apple());
		mfs1.Add(4, new Banana());
		MyFruitStore mfs2=MyFruitStore.Getfruitstore();
		InewJuicer newJuicer=new Adapter();
		System.out.println(newJuicer.newPort(mfs1.Get(1),mfs1.Get(3)));
		//fru.Display();
		//System.out.println("mfs1:"+mfs1.toString());
		//System.out.println("mfs2:"+mfs2.toString());
	}

}

