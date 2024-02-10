public class Practice {
public static void main(String ar[]) {
int a=22,b=23,c=24;
int x= a+b&c;
int y= b*c|a;
int z;
if (x>y) { z=++a | ++b ; }
else { z= ++c & c++ ; }
System.out.println(b*z);

}

}