public class beernursery{
public static void main (String[] args){
int beernum=99;
while (beernum > 0){
System.out.println(beernum+"bottles of beer on the wall");
System.out.println(beernum+"bottles of beer.");
System.out.println("Take one down.");
System.out.println("pass it around.");
beernum = beernum - 1;
if(beernum==0)
System.out.println(beernum+"bottles of beer on the wall");
else
System.out.println("No more bottles of beer on the wall");
}
}
}
 