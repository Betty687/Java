package Meb;

import java.util.Hashtable;

public class ChatGroup extends AbstractChatroom {
	private Hashtable members=new Hashtable();
	private String image;

	@Override
	public void register(Member member) {
		if(!members.contains(member))
		{
			members.put(member.getName(),member);
			 member.setChatroom(this);
		}

	}
	
	public void sendText(String from, String to, String message) {
		Member member=(Member)members.get(to);
		String newMessage=message;
		newMessage=message.replaceAll("��", "*");
		 member.receiveText(from,newMessage);

	}

	@Override
	public void sendImage(String from, String to, String image) {
		Member member=(Member)members.get(to);
		if(image.length()>5)
		{
			System.out.println("ͼƬ̫�󣬷���ʧ�ܣ�");
		}
		else
		{
			 member.receiveImage(from,image);
		}

	}

}
