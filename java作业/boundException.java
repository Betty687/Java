package exception;

public class boundException {

	public static void main(String[] args) {
		int b=0;
		int array[]=new int[3];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		try {
			System.out.println(2/b);
			}
		catch(ArithmeticException e) {
			System.out.println("���������쳣��catch��䲶�����쳣");
			System.out.println("������쳣Ϊ"+e);
		}
		finally {
			System.out.println("��������catch�鹲�еĲ���");
			System.out.println("try-catch-finally��������");
			}
		for(int i=0;i<=array.length;i++)
		{
		if(i>3)
			throw(new ArrayIndexOutOfBoundsException());
		else
			System.out.println(array[i]);
				}
		}
}