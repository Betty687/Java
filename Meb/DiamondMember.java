package Meb;

public class DiamondMember extends Member {

	public DiamondMember (String name)
	{
		super(name);
	}

	@Override
	public void sendText(String to, String message) {
		// TODO Auto-generated method stub
		System.out.println("钻石会员发送信息：");
		chatroom.sendText(name, to,message);

	}

	public void sendImage(String to, String image) {
		// TODO Auto-generated method stub
		System.out.println("钻石会员发送图片：");
		chatroom.sendImage(name, to, image);

	}



	

}
