import java.util.Random;
public class select {
public static void main(String[] args){
String a[]={"one","two","three","four"};
String b[]={"hand","foot","face"};
String c[]={"banana","apple","orange","pear"};
Random random=new Random();
int  x=(int) (Math.random()*a.length);
int  y=(int) (Math.random()*b.length);
int  z=(int) (Math.random()*c.length);
System.out.println(a[x]);
System.out.println(b[y]);
System.out.println(c[z]);
}
}
