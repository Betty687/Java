package Mem;

import java.util.ArrayList;

public class CaretakeChess {
	private ArrayList<MementoChess> memlist=new ArrayList<MementoChess>();
			public void AddMem(MementoChess mem)
			{
		memlist.add(mem);
			}
	public MementoChess getMem(int i)
	{
		return memlist.get(i);
	}
	
}
