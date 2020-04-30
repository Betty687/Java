package proxy;

public class ClientClass {
	public static void main(String[] args){
		CLocalPicShow cls=new CLocalPicShow();
		cls.ShowPic("photo");
		//IShowPic ipic=new CRemoPic();
		//IShowPic proxy=(IShowPic)new CLocalPicShow();
		//proxy.ShowPic("AAA");
	}

}
