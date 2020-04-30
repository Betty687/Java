package Ite;

public class TCLTelevision implements Television {

	private Object[] obj= {"湖南卫视","北京卫视","",""};
	public TVIterator createIterator() {
		
		return new TCLIterator();
	}

	class TCLIterator implements TVIterator
	{

		private int currentIndex=0;
		@Override
		public void setChannel(int i) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if(currentIndex<obj.length)
			{
				currentIndex++;
			}
		}

		@Override
		public void previous() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean isLast() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object currentChannel() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isFirst() {
			// TODO Auto-generated method stub
			return false;
		}
		
	}
}
