package ObvStock;

public class StockFutures extends AStockPrice {

	public StockFutures(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void notifyHolder() {
		// TODO Auto-generated method stub

		System.out.println("�ڻ������ˡ�"+code+":");
		for(IStockHolder ish:stockHolderlist)
		{
			ish.update(this);
		}
		price2=price;
	}

}
