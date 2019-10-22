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
			System.out.println("处理算数异常的catch语句捕获到了异常");
			System.out.println("捕获的异常为"+e);
		}
		finally {
			System.out.println("这是所有catch块共有的部分");
			System.out.println("try-catch-finally后面的语句");
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