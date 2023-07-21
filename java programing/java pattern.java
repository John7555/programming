import java.util.*;
class Main
{
public static void main(String[]args)
{
Scanner S=new Scanner(System.in);
String a;
a=S.nextLine();
int i;
int size=a.length();
for(i=0;i<size-1;i++)
{
System.out.print(" ");
}
for(i=0;i<size;i++)
{
System.out.print("*");
}
for(i=0;i<size-1;i++)
{
System.out.print(" ");
}
System.out.println();
for(i=0;i<size-1;i++)
{
System.out.print("*");
}
System.out.print(a);
for(i=0;i<size-1;i++)
{
System.out.print("*");
}
System.out.println();
for(i=0;i<size-1;i++)
{
System.out.print(" ");
}
for(i=0;i<size;i++)
{
System.out.print("*");
}
for(i=0;i<size-1;i++)
{
System.out.print(" ");
}
}
}