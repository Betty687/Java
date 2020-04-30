package ObvStock;

public class StockCommon extends AStockPrice {

	public StockCommon(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

	@Override
	
	protected void notifyHolder() {
		// TODO Auto-generated method stub

		System.out.println("期货更新了—"+code+":");
		for(IStockHolder ish:stockHolderlist)
		{
			ish.update(this);
		}
		price2=price;
	}
}
