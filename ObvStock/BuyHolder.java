package ObvStock;

import java.util.ArrayList;
import java.util.List;

public class BuyHolder implements IStockHolder {

	private List<AStockPrice> attentionlist;
	private String name;
	public BuyHolder(String name)
	{
		attentionlist=new ArrayList<AStockPrice>();
		this.name=name;
	}
	@Override
	public void update(AStockPrice asp) {
		// TODO Auto-generated method stub

		if(attentionlist.contains(asp))
		{
			System.out.println(name);
			
			if(asp.getPrice()-asp.getPrice2()>0)
			{
				System.out.println(asp.code+":");
				System.out.println("ԭ�ۣ�"+asp.price2+"-�ּۣ�");
				System.out.println("���ˣ�ˬ");
			}
			else
			{
				System.out.println(asp.code+":");
				System.out.println("ԭ�ۣ�"+asp.price2+"-�ּۣ�");
				System.out.println("���ˣ���");
			}
		}
	}

	@Override
	public void AddHolder(AStockPrice asp) {
		// TODO Auto-generated method stub
        attentionlist.add(asp);
        asp.Add(this);
	}
	
	

}















